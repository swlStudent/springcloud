package com.unionman.feign_consumer.web;

import com.unionman.feign_consumer.service.Consumer2Sevice;
import com.unionman.feign_consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    ConsumerService consumerService;
    @Autowired
    Consumer2Sevice consumer2Sevice;
    @GetMapping("/hello")
    public String sayHello(@RequestParam String name){

        return consumerService.sayHello(name);
    }
    @GetMapping("/welcome")
    public String sayWelcome(@RequestParam String name){

        return consumer2Sevice.sayWelcome(name);
    }
}

