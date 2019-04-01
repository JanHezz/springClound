package com.janhe.priveder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient //服务的提供者
@SpringBootApplication
public class PrivederApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrivederApplication.class, args);
	}

}
