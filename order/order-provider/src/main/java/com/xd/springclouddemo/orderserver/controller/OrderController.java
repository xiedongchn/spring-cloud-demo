package com.xd.springclouddemo.orderserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping(path = "/order")
public class OrderController {
    @Value("${env}")
    private String env;

    @RequestMapping(path = "/getEnv")
    public String getEnv() {
        return env;
    }
}
