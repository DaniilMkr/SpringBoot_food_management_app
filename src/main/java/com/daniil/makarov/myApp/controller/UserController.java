package com.daniil.makarov.myApp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/")
    public String registrationForm() {
        return "user";
    }
}
