package com.gyang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController
{
    @RequestMapping("/boot/hello")
    @ResponseBody
    public String getBody()
    {
        return "Hello Spring Boot!";
    }
}
