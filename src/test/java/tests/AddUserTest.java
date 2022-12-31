package tests;

import apis.User;
import io.qameta.allure.Feature;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojoModel.AddUser;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@Feature("Add New User")
public class AddUserTest {

@Test(description = "Add New User")
   public void addNewUser()
    {
        // Use Pojo Class to enter Body
      AddUser addUserData =new AddUser("Sara 1", "Automation Engineer");

        given().baseUri("https://reqres.in/api/").contentType(ContentType.JSON)
                .body(addUserData).when().post("users")
                .then().log().all()
                .assertThat().statusCode(201)
                .body("name", equalTo("Sara 1"))
                // Use normal assert
                .body("job", equalTo("Automation Engineer"));
    }

@Test(description = "Add New User and assert status code is 201")
    public void addNewUserWithRetrieveReturnResponse()
    {

        AddUser addUserData =new AddUser("Sara 1", "Automation Engineer");

        Response returnResponse= User.addUserdata(addUserData);


         assertThat(returnResponse.statusCode(),equalTo(201));
         assertThat(returnResponse.path("name"), equalTo("Sara 1"));
    }

@Test(description = "Add New User and assert status code is 201 Using Deserialization")
    public void addNewUserAndUseDeserialization()
    {
        AddUser addUserData =new AddUser("Sara 2", "Automation Engineer");

        Response returnResponse= User.addUserdata(addUserData);
       // use Deserialization
       AddUser returnedResponse= returnResponse.body().as(AddUser.class);

        assertThat(returnResponse.statusCode(),equalTo(201));
        assertThat(returnedResponse.getName(), equalTo("Sara 2"));
    }

}
