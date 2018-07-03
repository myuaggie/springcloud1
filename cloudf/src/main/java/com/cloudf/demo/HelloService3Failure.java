package com.cloudf.demo;

import org.springframework.stereotype.Component;

@Component
public class HelloService3Failure implements HelloService3{
    @Override
    public String client() {
        return "client3 is not available !";
    }
}
