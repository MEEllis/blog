package com.example.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class LoginController {
    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    public String login(){
        return "login";

    }
}
