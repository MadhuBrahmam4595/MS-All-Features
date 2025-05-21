package com.ProductServiceProvider_Kafka.service;

import com.ProductServiceProvider_Kafka.entity.Orders;
import com.ProductServiceProvider_Kafka.repo.OrderRepo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private static final String TOPIC = "order-topic";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private OrderRepo orderRepo;

    public Orders createAndSendOrder(Orders orders)throws JsonProcessingException {
        Orders save = orderRepo.save(orders);
        String orderJson = objectMapper.writeValueAsString(save);
        kafkaTemplate.send(TOPIC, orderJson);
        return save;
    }
}
