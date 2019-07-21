package com.unionman.feign_consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-producer2")
public interface Consumer2Sevice {
    @RequestMapping(value = "/welcome",method = RequestMethod.GET)
    String sayWelcome(@RequestParam(value = "name") String name);
}
