package com.gyang.controller;

import com.gyang.dao.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafIndexController
{
    @RequestMapping("/boot/index")
    public String index(Model model)
    {
        // th:text="${message}" -> model.getAttribute("message");'
        List<User> users = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            users.add(new User("name" + i, "male", i + " " + i * i + " " + 2008, i));
        }
        model.addAttribute("message", "Polygon Index!");
        model.addAttribute("users", users);
        return "index";
    }
}
