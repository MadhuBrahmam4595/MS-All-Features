package com.ProductServiceProvider_Kafka.repo;

import com.ProductServiceProvider_Kafka.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Orders, Long> {
}
