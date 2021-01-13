package cn.tx.demo.dubbo.consumer.service.impl;

import cn.tx.demo.dubbo.api.DemoService;
import cn.tx.demo.dubbo.consumer.service.ConsumerService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @author rookie-tx
 * @version 1.0.0 2021/1/13
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {

    @DubboReference
    private DemoService demoService;

    @Override
    public String consume() {
        return demoService.demo();
    }
}
