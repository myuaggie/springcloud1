package com.cloudf.demo;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client2",fallback = HelloService2Failure.class)
public interface HelloService2 {


    @RequestMapping(value="/hello-world")
    String hello(@RequestParam(name="name", required=false, defaultValue="Stranger") String name);
}
