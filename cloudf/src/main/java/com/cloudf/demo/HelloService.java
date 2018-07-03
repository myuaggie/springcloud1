package com.cloudf.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "eureka-client1",fallback = HelloServiceFailure.class)
public interface HelloService {
    @RequestMapping(value = "/helloConfig")
    String hello();
}
