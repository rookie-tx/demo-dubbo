package cn.tx.demo.dubbo.provider.service.impl;

import cn.tx.demo.dubbo.api.DemoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * @author rookie-tx
 * @version 1.0.0 2021/1/13
 */
@Service
@DubboService
public class ProviderServiceImpl implements DemoService {

    @Override
    public String demo() {
        return "hello dubbo";
    }
}
