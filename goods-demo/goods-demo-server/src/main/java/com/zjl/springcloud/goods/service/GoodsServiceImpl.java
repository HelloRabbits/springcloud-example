package com.zjl.springcloud.goods.service;

import com.zjl.springcloud.goods.bean.ConfigBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zhangjl
 * @create: 2019-05-29 11:03
 **/
@Slf4j
@RestController
public class GoodsServiceImpl implements GoodsService {

    @Value("${system.config.value}")
    private String value;

    @Autowired
    private ConfigBean configBean;

    @Override
    public Object findGoods(String goodsId) throws InterruptedException {
        Thread.sleep(2000);
        return "goods" + "," + value + "," + configBean.getValue();
    }

    @Override
    public Object testTimeOut() throws InterruptedException {
        Thread.sleep(3000);
        return "service timeout";
    }

    @Override
    public Object testException() throws Exception {
        log.info("exception");
        //Thread.sleep(300);
        return "exception";
    }
}
