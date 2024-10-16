package com.github.sunmeplz.cfg.it;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class CfgResourceTest {

    @Test
    public void testGetProperties() {
        assertEquals("World",getProperty("com.github.sunmeplz.name"));
        assertEquals("Hello World",getProperty("another.property"));
    }

    private String getProperty(String propertyKey) {
        return given()
            .when()
            .body(propertyKey)
            .post("/cfg")
            .then()
            .statusCode(200)
            .extract().asString();
    }
}
