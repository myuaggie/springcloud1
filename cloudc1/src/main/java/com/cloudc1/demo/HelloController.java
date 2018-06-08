package com.cloudc1.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {
    @Value("${name}")
    private String name;

    @GetMapping("/helloConfig")
    public String helloConfig(){
        return "hello "+name;
    }
}
