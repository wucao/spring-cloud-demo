package com.xxg.springcloud.hystrixfeign.controller;

import com.xxg.springcloud.hystrixfeign.client.HelloServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wucao on 2019/2/21.
 */
@RestController
public class HystrixFeignTestController {

    @Autowired
    private HelloServiceClient helloServiceClient;

    @RequestMapping("/test")
    public String test() {
        return helloServiceClient.hello();
    }
}
