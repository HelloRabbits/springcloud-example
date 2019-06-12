package com.zjl.springcloud.goods.service;

import com.zjl.springcloud.common.CommonConstants;
import com.zjl.springcloud.goods.service.fallback.GoodsFallBackServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 商品服务
 * @author: zhangjl
 * @create: 2019-05-29 10:50
 **/
@FeignClient(value = CommonConstants.GOODS_SERVER_ID, fallback = GoodsFallBackServiceImpl.class)
public interface GoodsService {

    @RequestMapping(value = "api/findGoods", method = RequestMethod.POST)
    String findGoods(String goodsId) throws InterruptedException;

    @RequestMapping(value = "api/timeOut", method = RequestMethod.POST)
    String testTimeOut() throws InterruptedException;

    @RequestMapping(value = "api/exception", method = RequestMethod.POST)
    String testException() throws Exception;
}
