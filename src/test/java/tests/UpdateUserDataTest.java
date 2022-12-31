package tests;

import apis.User;
import io.qameta.allure.Feature;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojoModel.UpdateUserDataPojo;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


@Feature("Update User Name and Job")
public class UpdateUserDataTest {

@Test(description = "Update User Name and Job")
    public void updateUserData()
   {
       UpdateUserDataPojo user=new UpdateUserDataPojo("morpheus","zion resident");

       Response response= User.updateUserData(user);

      UpdateUserDataPojo responseDe=response.body().as(UpdateUserDataPojo.class);

       assertThat(response.statusCode(),equalTo(200));
       assertThat(responseDe.getName(),equalTo("morpheus"));
       assertThat(responseDe.getJob(),equalTo("zion resident"));
   }






}
