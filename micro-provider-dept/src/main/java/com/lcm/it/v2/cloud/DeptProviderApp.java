package com.lcm.it.v2.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
public class DeptProviderApp {

    public static void main(String[] args) {
        SpringApplication.run(DeptProviderApp.class, args);
    }
}