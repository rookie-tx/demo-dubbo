package cn.tx.demo.dubbo.consumer.controller;

import cn.tx.demo.dubbo.consumer.service.ConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rookie-tx
 * @version 1.0.0 2021/1/13
 */
@RestController
@RequestMapping("/api/v1/consumer")
public class ConsumerController {

    private final ConsumerService consumerService;

    public ConsumerController(ConsumerService consumerService) {
        this.consumerService = consumerService;
    }

    @GetMapping("/dubbo/test")
    public String testDubbo() {
        return consumerService.consume();
    }
}
