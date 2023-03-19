package com.alticelabs.alticciproject.resource;

import com.alticelabs.alticciproject.model.AlticciResponse;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.ExampleObject;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.jboss.resteasy.reactive.RestPath;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/alticci")
@Tag(name = "Alticci resource")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface AlticciResource {

    @Path("/{n}")
    @Operation(
            operationId = "getAlticciValue",
            summary = "get a value from alticci sequence by key"
    )
    @APIResponses(value = {
            @APIResponse(responseCode = "200", description = "Value found", content = {
                    @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = AlticciResponse.class),
                            examples = {
                                    @ExampleObject(
                                            name = "New Value",
                                            value = "{\"value\":3, \"source\":\"result from function\"}"
                                    ),
                                    @ExampleObject(
                                            name = "Value from cache",
                                            value = "{\"value\":3, \"source\":\"result from cache\"}"
                                    )
                            }
                    )
            }),
            @APIResponse(responseCode = "500", description = "Server Error")
    })
    @GET
    Response getAlticciValue(@RestPath Integer n);
}