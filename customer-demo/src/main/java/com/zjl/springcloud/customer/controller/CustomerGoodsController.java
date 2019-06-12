package com.zjl.springcloud.customer.controller;

import com.zjl.springcloud.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zhangjl
 * @create: 2019-06-12 14:23
 **/
@RestController
public class CustomerGoodsController {

    @Autowired
    private GoodsService goodsService;


    @RequestMapping("/get/test")
    public Object getTest() {
        Object goods = null;
        try {
            goods = goodsService.testException();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return goods;
    }
}
