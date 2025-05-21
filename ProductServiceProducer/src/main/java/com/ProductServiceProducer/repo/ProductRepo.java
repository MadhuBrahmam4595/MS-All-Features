package com.ProductServiceProducer.repo;

import com.ProductServiceProducer.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
