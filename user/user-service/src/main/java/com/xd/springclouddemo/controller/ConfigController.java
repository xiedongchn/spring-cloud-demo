package com.xd.springclouddemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 *
 * @author xd
 * Created on 八月/3 00:11
 */
@RefreshScope
@RestController
@RequestMapping("/config")
public class ConfigController {
    @Value("${env}")
    private String env;

    @RequestMapping("/getEnv")
    public String getEnv() {
        return env;
    }
}
