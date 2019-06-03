package com.client.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/client1")
public class GreetingController {


    @Autowired
    private Client2 client2;

    @GetMapping("/greet")
    public String greet() {
        return client2.greet();
    }
}
