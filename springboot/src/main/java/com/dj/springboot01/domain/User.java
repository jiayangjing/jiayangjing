package com.dj.springboot01.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Value("${cn.dj.name}")
    private String name;
    @Value("${cn.dj.age}")
    private Integer age;
    @Value("${cn.dj.sex}")
    private Integer sex;
    @Value("${cn.dj.classroom}")
    private String classroom;
    @Value("${cn.dj.num}")
    private Integer num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", classroom='" + classroom + '\'' +
                ", num=" + num +
                '}';
    }
}
