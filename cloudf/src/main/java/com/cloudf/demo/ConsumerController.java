package com.cloudf.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;

    @Autowired
    HelloService2 helloService2;

    @Autowired
    HelloService3 helloService3;

    @RequestMapping(value = "feign-consumer", method = RequestMethod.GET)
    public String helloConsumer(){
        if (helloService.hello().equals("client1 is not available !")){
            return "client1 is not available !"+'\n'+helloService3.client();
        }
        return helloService2.hello(helloService.hello())+'\n'+helloService3.client();
    }
}
