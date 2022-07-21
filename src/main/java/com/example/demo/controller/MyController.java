package com.example.demo.controller;

import com.example.demo.anno.MyInterceptor;
import com.example.demo.entity.Animal;
import com.example.demo.entity.Cat;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

@Path("/xxx")
public class MyController {
    @Autowired
    private Animal animal;


    /*
     * http://localhost:8080/first/xxx/123
     */
    @Path("/{id}")
    @GET
    public String hello(@PathParam("id") int id) {
        System.out.println("xxx");
        return "xxx"; // 123
    }

    /*
     * http://localhost:8080/first/xxx/123/monkey
     */
    @Path("/{id}/{name}")
    @GET
    @Produces(MediaType.APPLICATION_JSON) // 產出(回傳) json
    public Animal getAnimal(@PathParam("id") int id, @PathParam("name") String name) {
        animal.setId(id);
        animal.setName(name);
        return animal;
    }

    /*
     * http://localhost:8080/first/xxx/queryParam/haha?key=value&param=p
     */
    @Path("/queryParam/{param}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getQueryParam(@PathParam("id") int id, @QueryParam("param") String param) {
        return param; // p
    }

    /*
     * http://localhost:8080/first/xxx/cat?id=4&name=meow
     */
    @Path("/cat")
    @GET
    public String hello(@BeanParam Cat cat) {
        System.out.println("cId=" + cat.getId());
        System.out.println("cName=" + cat.getName());
        return "cat";
    }

    /*
     * http://localhost:8080/first/xxx/matrixParam/qq;pm=1;mp=2?gy=3
     */
    @Path("/matrixParam/{param}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getMatrixParam(@MatrixParam("mp") String mp) {
        return mp; // 2
    }

    /*
     * http://localhost:8080/first/xxx/testInterceptor
     */
    @Path("/testInterceptor")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @MyInterceptor
    public String testInterceptor() {
        System.out.println("testInterceptor");
        return "finish";
    }

    /*
     * http://localhost:8080/first/xxx/exception
     */
    @Path("/exception")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @MyInterceptor
    public void exception() {
        System.out.println("exception");
//        throw new IllegalArgumentException("exception");
        int i = 1 / 0;
    }

    /*
     * http://localhost:8080/first/xxx/exception2
     */
    @Path("/exception2")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @MyInterceptor
    public void exception2() throws IOException {
        System.out.println("exception2");
        throw new IOException("exception2");
    }
}
