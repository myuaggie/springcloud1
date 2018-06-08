package com.cloudf.demo;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceFailure implements HelloService{
    @Override
   public String hello() {
        return "client1 is not available !";
    }
}
