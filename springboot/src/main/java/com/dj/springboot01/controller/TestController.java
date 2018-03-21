package com.dj.springboot01.controller;

import com.dj.springboot01.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    private User user;

    @Value("${com.dj.name}")
    private String name;

    @Value("${com.dj.age}")
    private Integer age;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }


    // 获取com.dj的name值和age
    @RequestMapping("getNameAndAge")
    @ResponseBody
    public String getNameAndAge(){
        System.out.println(name+"======="+ age);
        return "姓名"+name+"　年龄："+age;
    }

    // 获取user对象
    @RequestMapping("getUser")
    @ResponseBody
    public String getUser(){
        System.out.println(user.toString());
        return "姓名"+user.getName()+"　年龄："+user.getAge()+"　性别："+user.getSex()+"　班级："+user.getClassroom()+"　编号："+user.getNum();
    }

    @RequestMapping("")
    @ResponseBody
    public String get(){
        return "";
    }

}
