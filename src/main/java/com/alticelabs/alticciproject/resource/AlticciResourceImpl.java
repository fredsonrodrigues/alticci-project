package com.alticelabs.alticciproject.resource;

import com.alticelabs.alticciproject.service.AlticciService;

import javax.inject.Inject;
import javax.ws.rs.core.Response;

public class AlticciResourceImpl implements AlticciResource {

    @Inject
    public AlticciService alticci;

    @Override
    public Response getAlticciValue(Integer n) {
        return Response.ok(alticci.getAlticciSequenceNumber(n)).build();
    }
}
