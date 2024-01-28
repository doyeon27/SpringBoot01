package com.yi.spring.controller;

import com.yi.spring.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    UserService userService;


    @GetMapping("/home")
    public String index(Model model, HttpSession httpSession) {

        return "main";
    }

    @GetMapping("/login")
    public String loginPG(Model model, HttpSession httpSession){
        return "/login";
    }

    @GetMapping("/usersignUp")
    public String usersignUp(Model model, HttpSession httpSession){
        return "usersignUp";
    }

    @GetMapping("/hostsignUp")
    public String hostsignUp(Model model, HttpSession httpSession){
        return "hostsignUp";
    }

    @GetMapping("/signUp")
    public String signUp(Model model, HttpSession httpSession){
        return "signUp";
    }

    @GetMapping("/restHost")
    public String host(Model model, HttpSession httpSession){
        return "restHost";
    }


}