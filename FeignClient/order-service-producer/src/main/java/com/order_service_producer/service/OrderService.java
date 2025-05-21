package com.order_service_producer.service;

import com.order_service_producer.entity.Orders;
import com.order_service_producer.feign.ProductClient;
import com.order_service_producer.model.Product;
import com.order_service_producer.repo.OrdersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrdersRepo ordersRepo;

    @Autowired
    private ProductClient productClient;

    public Orders placeOrder(Long productId, int quantity){
        Product product = productClient.getProductById(productId);
        Orders orders = new Orders();
        orders.setProductId(product.getId());
        orders.setProductName(product.getName());
        orders.setProductPrice(product.getPrice());
        return ordersRepo.save(orders);
    }
}
