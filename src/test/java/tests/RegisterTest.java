package tests;

import apis.User;
import io.qameta.allure.Feature;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojoModel.ErrorMessage;
import pojoModel.Register;
import pojoModel.RegisterDeserialization;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@Feature("User Registration")
public class RegisterTest {

    @Test(description = "should Able To Register by entering email and password")
    public void shouldAbleToRegister()
    {
        Register user =new Register("eve.holt@reqres.in","pistol");

        Response response=User.register(user);

        RegisterDeserialization responseDe=response.body().as(RegisterDeserialization.class);

        assertThat(response.statusCode(), equalTo(200));
        assertThat(responseDe.getId(),not(equalTo(null)));

    }

    @Test(description = "should Not Able To Register by entering email only")
    public void shouldNotAbleToRegisterWithEmailOnly()
    {
        Register user =new Register("eve.holt@reqres.in");

        Response response=User.register(user);

        ErrorMessage responseDe=response.body().as(ErrorMessage.class);


        assertThat(response.statusCode(), equalTo(400));
        assertThat(responseDe.getError(),equalTo("Missing password"));
    }



}
