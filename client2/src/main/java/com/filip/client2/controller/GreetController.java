package com.filip.client2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/client2")
public class GreetController {


    @GetMapping(value = "/greet")
    public String greet() {
        System.out.println("I have been called");
        return "This is a greeting from client 2";
    }

}
