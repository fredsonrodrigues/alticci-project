package com.alticelabs.alticciproject.resource;

import org.jboss.resteasy.reactive.RestPath;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/alticci")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface AlticciResource {

    @Path("/{n}")
    @GET
    Response getAlticciValue(@RestPath Integer n);
}