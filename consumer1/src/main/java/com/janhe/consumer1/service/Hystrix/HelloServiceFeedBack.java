package com.janhe.consumer1.service.Hystrix;

import com.janhe.consumer1.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @Auther: Jan 何康宁
 * @Date: 2019-4-1 10:56
 * @Description:
 */
@Component
public class HelloServiceFeedBack implements HelloService {
    @Override
    public String sayHiFromClientOne(String name) {
    return "hello" +name+", this messge send failed ";
    }
}
