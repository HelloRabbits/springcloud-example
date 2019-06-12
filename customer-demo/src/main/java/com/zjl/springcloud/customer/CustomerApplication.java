package com.zjl.springcloud.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description:
 * @author: zhangjl
 * @create: 2019-06-12 14:22
 **/
@EnableFeignClients(value = {"com.zjl.springcloud.goods.service"})
@EnableEurekaClient
@SpringBootApplication(scanBasePackages = {"com.zjl"})
public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }
}
