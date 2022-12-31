package base;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class RequestSpec {


    public static RequestSpecification getRequestSpec()
    {
        RequestSpecification requestSpec=  given()
                .baseUri("https://reqres.in/api/")
                .contentType(ContentType.JSON).log().all();

        return requestSpec;
    }
}
