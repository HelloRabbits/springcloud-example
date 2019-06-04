package com.zjl.springcloud.goods.service;

import com.zjl.springcloud.common.CommonConstants;
import com.zjl.springcloud.goods.service.fallback.GoodsFallBackServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 商品服务
 * @author: zhangjl
 * @create: 2019-05-29 10:50
 **/
@FeignClient(value = CommonConstants.GOODS_SERVER_ID, fallback = GoodsFallBackServiceImpl.class)
public interface GoodsService {

    @RequestMapping("api/findGoods")
    Object findGoods(String goodsId) throws InterruptedException;

    @RequestMapping("api/timeOut")
    Object testTimeOut() throws InterruptedException;

    @RequestMapping("api/exception")
    Object testException() throws Exception;
}
