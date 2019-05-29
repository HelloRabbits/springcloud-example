package com.zjl.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description:
 * @author: zhangjl
 * @create: 2019-05-29 09:43
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaAppliacation {

    public static void main(String[] args) {
        SpringApplication.run(EurekaAppliacation.class, args);
    }

}
