package com.zjl.springcloud.gateway.controller;

import com.zjl.springcloud.goods.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zhangjl
 * @create: 2019-06-11 10:44
 **/
@Slf4j
@RestController
public class GoodsController {
    @Autowired
    private GoodsService goodsService;


    @RequestMapping("/api/goods/test")
    public Object goodsTest() throws Exception {
        Object o = goodsService.testException();
        log.info(o.toString());
        return o;
    }
}
