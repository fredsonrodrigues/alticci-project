package com.alticelabs.alticciproject.resource;

import org.eclipse.microprofile.openapi.annotations.Operation;
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
    @GET
    Response getAlticciValue(@RestPath Integer n);
}