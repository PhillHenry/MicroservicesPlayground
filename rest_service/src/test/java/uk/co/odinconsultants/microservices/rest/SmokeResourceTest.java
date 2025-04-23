package uk.co.odinconsultants.microservices.rest;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static uk.co.odinconsultants.microservices.rest.SmokeResource.SMOKE_TEST_MESSAGE;

@QuarkusTest
public class SmokeResourceTest {
    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/hello")
                .then()
                .statusCode(200)
                .body(is(SMOKE_TEST_MESSAGE));
    }
}
