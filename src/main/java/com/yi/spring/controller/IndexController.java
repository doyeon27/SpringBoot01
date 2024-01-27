package com.yi.spring.controller;

import com.yi.spring.entity.User;
import com.yi.spring.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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




}