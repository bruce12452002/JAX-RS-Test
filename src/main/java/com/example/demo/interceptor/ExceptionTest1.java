package com.example.demo.interceptor;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * @Provider + ExceptionMapper 只會在有例外時才調用
 * 有對應的 exception 才會執行，多個 ExceptionMapper 只會執行一個有對應到的
 * 如果沒有最大的 Exception，會在控制台報錯，網頁顯示 500
 */
@Provider
public class ExceptionTest1 implements ExceptionMapper<Exception> {

    @Override
    public Response toResponse(Exception exception) {
        System.out.println("ExceptionTest1");
        return null;
    }
}
