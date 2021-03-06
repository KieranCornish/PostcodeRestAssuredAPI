package com.spartaglobal.RestassuredPostcodes;

import static org.junit.Assert.assertTrue;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;


public class SinglePostcodesTest
{
    private static Response singlePostcodeResponse;
    @BeforeClass
    public static void setup(){
        baseURI = "https://api.postcodes.io";
        basePath = "/postcodes/";
        singlePostcodeResponse = get("cm131hx");
}
    @Test
    public void postcodesRequestIsSuccessful(){
        get("cm131hx")
                .then()
                .statusCode(200)
                .body("result.postcode", equalTo("CM13 1HX"));
    }


}
