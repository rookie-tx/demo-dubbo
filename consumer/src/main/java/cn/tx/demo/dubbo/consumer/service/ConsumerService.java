package cn.tx.demo.dubbo.consumer.service;

/**
 * @author rookie-tx
 * @version 1.0.0 2021/1/13
 */
public interface ConsumerService {

    /**
     * 消费
     * @return rpc调用结果
     */
    String consume();
}
