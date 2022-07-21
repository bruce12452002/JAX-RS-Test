package com.example.demo.entity;

import javax.ws.rs.QueryParam;

/*
 * 使用 @BeanParam 時，不可注入
 */
public class Cat {
    /*
     * 使用 @BeanParam 時，不可用基本型態
     * @QueryParam @QueryParam 只能擇其一
     */
    @QueryParam("id")
//    @FormParam("id")
    private Integer id;

    @QueryParam("name")
//    @FormParam("name")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
