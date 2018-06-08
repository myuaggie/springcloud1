package com.cloudc1.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;



@EnableEurekaClient
@SpringBootApplication
@RestController
@RefreshScope
public class DemoApplication {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello client1";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}


