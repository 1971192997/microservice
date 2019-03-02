package com.lever.springcloud.cfgbeans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer8100_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer8100_App.class, args);
    }

}
