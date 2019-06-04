package com.zjl.springcloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description: start class
 * @author: zhangjl
 * @create: 2019-05-29 11:09
 **/
@SpringCloudApplication
@EnableEurekaClient
@EnableFeignClients(value = {"com.zjl.springcloud.goods.service"})
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
