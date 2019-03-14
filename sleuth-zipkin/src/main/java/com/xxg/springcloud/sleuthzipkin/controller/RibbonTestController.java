package com.xxg.springcloud.sleuthzipkin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wucao on 2019/2/21.
 */
@RestController
public class RibbonTestController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/test")
    public String test() {
        String results = restTemplate.getForObject("http://hello-service/hello", String.class);
        return results;
    }

}
