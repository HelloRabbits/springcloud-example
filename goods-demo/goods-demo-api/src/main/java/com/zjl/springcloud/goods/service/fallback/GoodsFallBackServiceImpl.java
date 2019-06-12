package com.zjl.springcloud.goods.service.fallback;

import com.zjl.springcloud.goods.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: zhangjl
 * @create: 2019-06-04 14:29
 **/
@Component
@Slf4j
public class GoodsFallBackServiceImpl implements GoodsService {
    @Override
    public String findGoods(String goodsId) throws InterruptedException {
        log.info("fallback goods service");
        return "fallback goods service";
    }

    @Override
    public String testTimeOut() {
        log.info("fallback service timeout");
        return "fallback service timeout";
    }

    @Override
    public String testException() throws Exception {
        log.info("fallback service exception");
        return "fallback service exception";
    }
}
