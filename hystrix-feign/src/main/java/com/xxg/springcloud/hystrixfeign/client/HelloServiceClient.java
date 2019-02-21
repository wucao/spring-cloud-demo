package com.xxg.springcloud.hystrixfeign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wucao on 2019/2/21.
 */
@FeignClient(value = "hello-service", fallback = HelloServiceFallback.class)
public interface HelloServiceClient {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    String hello();
}
