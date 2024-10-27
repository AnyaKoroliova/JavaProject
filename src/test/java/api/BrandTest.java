package api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BrandTest {


    @Test
    public void getBrandList(){
        RestAssured.baseURI = "https://qauto.forstudy.space/api";

        Response brandList = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .when()
                .get("/cars/brands");

        assertEquals(brandList.getStatusCode(), 200, "Status code is incorrect!");

        int brandId = brandList.jsonPath().get("data.find { it.id == 1 }.id");
        assertEquals(1, brandId, "ID should be 1");

        String brandTitle = brandList.jsonPath().get("data.find { it.id == 1 }.title");
        assertEquals("Audi", brandTitle, "Brand name should be 'Audi'");

    }
}
