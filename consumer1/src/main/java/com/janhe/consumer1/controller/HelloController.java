package com.janhe.consumer1.controller;

import com.janhe.consumer1.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: Jan 何康宁
 * @Date: 2019-4-1 10:01
 * @Description:
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)

    public String sayHi(@RequestParam String name) {
        return helloService.sayHiFromClientOne(name);
    }


}
