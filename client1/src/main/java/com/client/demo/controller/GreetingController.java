package com.client.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Simple rest controller exposing endpoint in which via @{@link Client2} sends http request to the client2
 *
 * @author filip.t
 * @version 1.0
 * @since 1.0
 */

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
