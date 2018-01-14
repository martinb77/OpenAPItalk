package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api;

import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.Errors;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.response.BooleanResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Path("/api")
@Produces("application/json")
public class QAcoffeeAPI {

    @Operation(summary = "Returns something.", description = "some more description here", tags = {"someTag"},
    responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation, may contain business errors.",
                    content = @Content(schema = @Schema(implementation = BooleanResponse.class))),
            @ApiResponse(responseCode = "500", description = "An internal error occurred, unable to process the request in a proper way.",
                    content = @Content(schema = @Schema(implementation = Errors.class)))}
    )
    @GET
    @Path("/doSomething")
    public Response doSomething() {
        // do some magic!
        return Response.ok(new BooleanResponse(Boolean.FALSE, null)).build();
    }

}
