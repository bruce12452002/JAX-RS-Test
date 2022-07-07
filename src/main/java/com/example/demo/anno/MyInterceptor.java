package com.example.demo.anno;

import javax.ws.rs.NameBinding;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 使用 @NameBinding 可以有攔截器的功能
 * 1.寫一支 annotation，裡面要有 @NameBinding
 * 2.寫一支 class 繼承 ws.rs-api JAR 包裡的 container/XxxFilter
 * 3.class 上面要有 1 的 annotation
 * 4.將 class 註冊到 ResourceConfig，可看 JerseyResourceConfig，這支已繼承 ResourceConfig
 */
@NameBinding
@Retention(RetentionPolicy.RUNTIME)
public @interface MyInterceptor {
}
