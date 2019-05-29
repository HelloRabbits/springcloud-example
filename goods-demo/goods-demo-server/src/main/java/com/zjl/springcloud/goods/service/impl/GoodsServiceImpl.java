package com.zjl.springcloud.goods.service.impl;

import com.zjl.springcloud.goods.service.GoodsService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zhangjl
 * @create: 2019-05-29 11:03
 **/
@RestController
public class GoodsServiceImpl implements GoodsService {
    @Override
    public Object findGoods(String goodsId) {
        return "goods";
    }
}
