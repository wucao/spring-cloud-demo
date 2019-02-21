package com.xxg.springcloud.hystrixfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by wucao on 2019/2/21.
 */
@SpringBootApplication
@EnableFeignClients
public class SpringCloudHystrixFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudHystrixFeignApplication.class, args);
    }
}
