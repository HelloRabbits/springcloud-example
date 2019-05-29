package com.zjl.springcloud.goods.service;

import com.zjl.springcloud.common.CommonConstants;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: 商品服务
 * @author: zhangjl
 * @create: 2019-05-29 10:50
 **/
@FeignClient(value = CommonConstants.GOODS_SERVER_ID)
public interface GoodsService {

    @RequestMapping("api/findGoods")
    Object findGoods(String goodsId);
}
