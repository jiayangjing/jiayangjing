package com.dj.springboot01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JyjController {

    @RequestMapping("")
    @ResponseBody
    public String get(){
        return "";
    }
}
