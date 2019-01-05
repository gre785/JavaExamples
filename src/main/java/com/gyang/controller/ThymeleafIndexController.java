package com.gyang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafIndexController
{
    @RequestMapping("/boot/index")
    public String index(Model model)
    {
        model.addAttribute("message", "gyang is using HTML5");
        return "index";
    }
}
