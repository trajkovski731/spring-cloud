package com.filip.client2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Simple rest controller exposing endpoint that returns String text
 *
 * @author filip.t
 * @version 1.0
 * @since 1.0
 */

@RestController
@RequestMapping(value = "/client2")
public class HelloController {


    @GetMapping(value = "/hello")
    public String greet() {
        System.out.println("I have been called");
        return "Hello from client 2";
    }

}
