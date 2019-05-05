package com.example.unittest;

import org.hamcrest.core.IsEqual;
import org.junit.jupiter.api.Test;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.*;

public class RestServiceTest {
    @Test
    void testEchoService() {
        given().when().get("http://localhost:8080/pets")
                .then().assertThat().statusCode(200)
                .body("message", equalTo("Hello"));
//                .body("", equalTo("Hello"));
    }
}
