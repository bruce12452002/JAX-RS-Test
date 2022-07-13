package com.example.demo.config;

import com.example.demo.interceptor.Test1;
import com.example.demo.interceptor.Test2;
import com.example.demo.interceptor.Test3;
import com.example.demo.interceptor.Test4;
import org.glassfish.jersey.server.ResourceConfig;

public class JerseyResourceConfig extends ResourceConfig {
    public JerseyResourceConfig() {
        /**
         * 使用 @NameBinding 和 @Provider 時，要註冊實作的類別才會跑攔截器的方法
         * @Provider 所有請求都攔截；@NameBinding 只攔自定義註解
         */
//        register(Test1.class);
//        register(Test2.class);
//        register(Test3.class);
//        register(Test4.class);
        // 可將上面的 class 統一放在一包，然後和下面的 packages 一起使用，這樣就不用每次增加就註冊了
         packages("com.example.demo.controller", "com.example.demo.interceptor"); // 路徑不對會 404

        // 掃描包
//        packages("com.example.demo.controller"); // 路徑不對會 404

    }
}
