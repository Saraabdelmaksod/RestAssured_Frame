package tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojoModel.DataDeserialization;
import pojoModel.UserDeserialization;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class GetUserData {

    @Test

    public void getuserDat()
    {

        Response response=given().baseUri("https://reqres.in/api/")
                .contentType(ContentType.JSON)
                .when()
                .get("users?page=2")
                .then().log().all().extract().response();

      //  UserDeserialization responseDe=response.body().as(UserDeserialization.class);
      //  DataDeserialization re=response.body().as(DataDeserialization.class);

      //  assertThat(response.statusCode(), equalTo(200));
       // assertThat(responseDe.getPage(), equalTo(2));
    }
}
