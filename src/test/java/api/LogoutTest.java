package api;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.given;


public class LogoutTest {

    SoftAssert softAssert = new SoftAssert();
    @Test
    public void testLogoutResponse() {

        Response responseCode =
                given()
                        .when()
                        .get("https://qauto.forstudy.space/api/auth/logout");
        responseCode.then().statusCode(200);
        softAssert.assertEquals(responseCode.getStatusCode(), 200, "Status code is incorrect!");

        String body = responseCode.jsonPath().get("status");
        softAssert.assertEquals("ok", body);
    }
}
