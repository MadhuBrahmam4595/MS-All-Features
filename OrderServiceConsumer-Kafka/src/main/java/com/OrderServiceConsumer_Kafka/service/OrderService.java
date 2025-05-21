package com.OrderServiceConsumer_Kafka.service;

import com.OrderServiceConsumer_Kafka.entity.Orders;
import com.OrderServiceConsumer_Kafka.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Orders saveOrder(Orders order) {
        return orderRepository.save(order);
    }
}
