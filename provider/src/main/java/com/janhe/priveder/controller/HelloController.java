package com.janhe.priveder.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Jan 何康宁
 * @Date: 2019-4-1 09:28
 * @Description:
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    String port;
    @RequestMapping("/hello")
    public String home(@RequestParam String name) {
        return "hi "+name+",port:" +port;
    }
}
