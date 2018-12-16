package com.lcm.it.v3.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientRestController {

    @Value("${spring.application.name}")
    private String applicationName;


    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig()
    {
        String str = "applicationName: " + applicationName +"\t port: " + port;
        System.out.println("******str: " + str);
        return "applicationName: " + applicationName +"\t port: " + port;
    }

}
