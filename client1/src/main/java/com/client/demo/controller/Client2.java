package com.client.demo.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Feign client responsible to communicate with the client2
 *
 * @author filip.t
 * @version 1.0
 * @see @{@link FeignClient}
 */

@FeignClient("client2")
public interface Client2 {

    @GetMapping(value = "/client2/hello")
    String greet();
}
