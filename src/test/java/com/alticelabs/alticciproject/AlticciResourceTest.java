package com.alticelabs.alticciproject;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class AlticciResourceTest {

    @Test
    void testAlticciOneEndpoint() {
        given()
          .when().get("/alticci/0")
          .then()
             .statusCode(200)
                .body("value", is(0), "source", is("result from cache"));
    }

    @Test
    void testAlticciTwoEndpoint() {
        given()
                .when().get("/alticci/1")
                .then()
                .statusCode(200)
                .body("value", is(1), "source", is("result from cache"));
    }

    @Test
    void testAlticciTreeEndpoint() {
        given()
                .when().get("/alticci/5")
                .then()
                .statusCode(200)
                .body("value", is(2), "source", is("result from function"));
    }

}