package com.softserveinc.ita.homeproject.application.exception.mapper.jax;

import com.softserveinc.ita.homeproject.application.exception.mapper.BaseExceptionMapper;
import cz.jirutka.rsql.parser.RSQLParserException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

@Provider
public class BadRequestExceptionMapper extends BaseExceptionMapper<RSQLParserException> {
    @Override
    protected Response.Status getStatus() {
        return Response.Status.BAD_REQUEST;
    }

    @Override
    protected String extractMessage(RSQLParserException exception) {
        return "Illegal argument for request.";
    }
}