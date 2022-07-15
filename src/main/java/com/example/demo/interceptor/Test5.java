package com.example.demo.interceptor;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

/**
 * Test1~Test4 執行的是 ContainerResponseFilter，但這支是 ContainerResponseFilter
 * 所以會執行完方法後才執行這個 Filter
 */
@Provider
public class Test5 implements ContainerResponseFilter {

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
        System.out.println("test5");
    }
}
