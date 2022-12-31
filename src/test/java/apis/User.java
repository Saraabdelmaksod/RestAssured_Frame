package apis;

import base.RequestSpec;
import io.restassured.response.Response;
import pojoModel.AddUser;
import pojoModel.Register;
import pojoModel.UpdateUserDataPojo;

import static io.restassured.RestAssured.given;

public class User {

    public static Response register(Register user)
    {
        return given().spec(RequestSpec.getRequestSpec())
                .body(user)
                .when()
                .post("register")
                .then().log().all()
                .extract().response();
    }
    public static Response addUserdata(AddUser user)
    {
        return given().spec(RequestSpec.getRequestSpec())
                .body(user)
                .when().
                post("users")
                .then().log().all()
                .extract().response();
    }

    public static Response updateUserData(UpdateUserDataPojo user)
    {
        return given().spec(RequestSpec.getRequestSpec())
                .body(user)
                .when()
                .put("users/2")
                .then().log().all()
                .extract().response();
    }

}
