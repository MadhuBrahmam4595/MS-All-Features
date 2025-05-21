package com.OrderServiceConsumer_Kafka.kafka;

import com.OrderServiceConsumer_Kafka.entity.Orders;
import com.OrderServiceConsumer_Kafka.service.OrderService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaOrderConsumer {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private OrderService orderService;

    @KafkaListener(topics = "order-topic", groupId = "order-group")
    public void consume(String message) throws JsonProcessingException {
        Orders order = objectMapper.readValue(message, Orders.class);
        orderService.saveOrder(order);
        System.out.println("Consumed Order from Kafka: " + order);
    }
}
