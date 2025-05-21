package com.OrderServiceConsumer.service;

import com.OrderServiceConsumer.entity.Orders;
import com.OrderServiceConsumer.model.Product;
import com.OrderServiceConsumer.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Orders placeOrder(Long productId, int quantity) {
        Product product = restTemplate.getForObject("http://localhost:8080/products/" + productId, Product.class);
        Orders order = new Orders();
        order.setProductId(product.getId());
        order.setProductName(product.getName());
        order.setProductPrice(product.getPrice());
        order.setQuantity(quantity);
        return orderRepository.save(order);
    }


}
