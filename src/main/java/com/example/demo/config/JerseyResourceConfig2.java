package com.example.demo.config;

import com.example.demo.interceptor.Test1;
import com.example.demo.interceptor.Test2;
import com.example.demo.interceptor.Test3;
import com.example.demo.interceptor.Test4;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

/**
 * 使用這個類別，就不需要 JerseyConfig 和 JerseyResourceConfig
 */
//@Component
//@ApplicationPath("/second")
public class JerseyResourceConfig2 extends ResourceConfig {
    public JerseyResourceConfig2() {
        /**
         * 使用 @NameBinding 和 @Provider 時，要註冊實作的類別才會跑攔截器的方法
         * @Provider 所有請求都攔截；@NameBinding 只攔自定義註解
         */
        register(Test1.class);
        register(Test2.class);
        register(Test3.class);
        register(Test4.class);

        // 掃描包
        packages("com.example.demo.controller"); // 路徑不對會 404
    }
}
