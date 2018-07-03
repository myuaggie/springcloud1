## spring cloud

### Eureka server (Spring Cloud Eureka)

port:9000  

![s](https://raw.githubusercontent.com/myuaggie/springcloud1/master/img1.png)

### Eureka client 1

port:9001  

mappings: 
* /hello
* /helloConfig   (fetching configuration files(eureka-client1.properties) from github)

### Eureka client 2

port:9002  

mappings:
* /hello
* /hello-world  (greeting template)

### Eureka client 3

port:9003  

mappings:
* /hello
* /client  (show all eureka clients)

### config-server (Spring Cloud Bus)

port:9050  

using rabbitmq (port:5672) to send message between config-server and eureka-client1
```
url:localhost:9050/actuator/bus-refresh method:post to refresh the change on github  
```
### feign-consumer (Spring Cloud Feign)

for load balance and Circuit Breaker(enable Hystrix)  

port:9030  

mappings:
* /feign-consumer
```
return helloService2.hello(helloService.hello())+'\n'+helloService3.client();
```
helloService1/2/3 correspond to eureka-client1/2/3  

HelloService1/2/3Failure correspond to circuit breaker of eureka-client1/2/3  


### gateway-zuul (Spring Cloud Zuul)

port:9040  

mappings:
* /hello/*
```
zuul.routes.feign-consumer.path=/hello/**
zuul.routes.feign-consumer.service-id=feign-consumer
```


for all eureka clients
```
eureka.client.serviceUrl.defaultZone=http://localhost:9000/eureka/
```
