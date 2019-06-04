package com.zjl.springcloud.goods.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: zhangjl
 * @create: 2019-06-04 10:46
 **/
@Data
@Component
@ConfigurationProperties(prefix = "system.config")
public class ConfigBean {
    private String value;
}
