package com.example.demo.interceptor;

import com.example.demo.anno.MyInterceptor;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;

@MyInterceptor
public class Test1 implements ContainerRequestFilter {
    @Override
    public void filter(ContainerRequestContext requestContext) {
        System.out.println("test1");
    }
}
