package com.client.demo.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("client2")
public interface Client2 {

    @GetMapping(value = "/client2/greet")
    String greet();
}
