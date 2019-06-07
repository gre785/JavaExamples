package com.gyang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController
{
    @RequestMapping("/boot/index")
    public String index(Model model)
    {
        model.addAttribute("message", "www.ShorterWays.com");
        return "index";
    }
}
