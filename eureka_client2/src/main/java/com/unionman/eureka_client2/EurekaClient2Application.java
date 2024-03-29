package com.unionman.eureka_client2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
@SpringBootApplication
public class EurekaClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient2Application.class, args);
    }
    @Value("${server.port}")
    String port;

    @RequestMapping("/welcome")
    public String welcome(@RequestParam(value = "name") String name) {
        return "welcome" + name + " ,this is producer2, I am from port:" + port;
    }

}
