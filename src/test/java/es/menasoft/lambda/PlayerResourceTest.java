package es.menasoft.lambda;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class PlayerResourceTest {

    @Test
    void shouldRetrievePlayersList() {
        given().when().get("/players").then().statusCode(200).body("$.size()", is(2));
    }
}