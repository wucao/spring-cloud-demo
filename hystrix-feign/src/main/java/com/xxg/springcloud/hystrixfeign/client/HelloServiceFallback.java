package com.xxg.springcloud.hystrixfeign.client;

import org.springframework.stereotype.Component;

/**
 * Created by wucao on 2019/2/21.
 */
@Component
public class HelloServiceFallback implements HelloServiceClient {

    @Override
    public String hello() {
        return "fallback";
    }
}
