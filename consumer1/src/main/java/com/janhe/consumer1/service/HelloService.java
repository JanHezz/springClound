package com.janhe.consumer1.service;

import com.janhe.consumer1.service.Hystrix.HelloServiceFeedBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-provider" ,fallback = HelloServiceFeedBack.class)//指定服务的提供者
@Service
public interface HelloService {

     @RequestMapping(value = "/hello", method = RequestMethod.GET)
     String sayHiFromClientOne(@RequestParam(value = "name") String name);


}
