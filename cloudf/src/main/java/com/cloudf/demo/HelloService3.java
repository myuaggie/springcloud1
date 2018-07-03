package com.cloudf.demo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client3",fallback = HelloService3Failure.class)
public interface HelloService3 {
    @RequestMapping(value = "/client")
    String client();
}
