package com.xxg.springcloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wucao on 2019/2/21.
 */
@RestController
public class ConfigClientTestController {

    /**
     * 该配置值来源于git仓库中的配置文件
     */
    @Value("${info.from}")
    private String testValue;

    @RequestMapping("/test")
    public String test() {
        return testValue;
    }

}
