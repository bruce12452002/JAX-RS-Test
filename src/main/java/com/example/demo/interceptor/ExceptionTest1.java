package com.example.demo.interceptor;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ExceptionTest1 implements ExceptionMapper<Exception> {

    @Override
    public Response toResponse(Exception exception) {
        System.out.println("哇哈哈");
        return null;
    }
}
