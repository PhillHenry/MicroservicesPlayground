package uk.co.odinconsultants.microservices.rest;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import static uk.co.odinconsultants.microservices.rest.WebConstants.SMOKE_ENDPOINT;

@Path(SMOKE_ENDPOINT)
public class SmokeResource {

    static final String SMOKE_TEST_MESSAGE = "Hello from Quarkus REST";

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return SMOKE_TEST_MESSAGE;
    }
}
