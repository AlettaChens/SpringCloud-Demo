package com.example.busserverconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigInfoController {
    //    数据来自读取配置中心的配置文件
    @Value("${user.userName}")
    private String userName;

    @Value("${user.password}")
    private String password;


    @RequestMapping(value = "/userinfo", method = RequestMethod.GET)
    public String getUserInfo() {
        return "userName:" + userName + " password:" + password;
    }

}
