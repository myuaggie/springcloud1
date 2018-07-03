package com.cloudf.demo;

import org.springframework.stereotype.Component;

@Component
public class HelloService2Failure implements HelloService2{
    @Override
    public String hello(String name) {
        return "client2 is not available !";
    }
}
