package com.example.demo.interceptor;

import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;

/**
 * @Provider 會在方法調用前執行，是全域性的，所有的 @Provider 都會執行
 */
@Priority(Priorities.AUTHENTICATION)
@Provider
public class Test2 implements ContainerRequestFilter {
    @Override
    public void filter(ContainerRequestContext requestContext) {
        System.out.println("test2");
    }
}
