package com.product_service_producer.controller;

import com.product_service_producer.ProductService;
import com.product_service_producer.entity.Product;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    @Operation(summary = "Add new product", description = "Adds a product to the database")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        return ResponseEntity.ok(productService.saveProduct(product));
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get product by ID", description = "Returns product details by product ID")
    public ResponseEntity<Product> getProduct(@PathVariable Long id) {
        return ResponseEntity.ok(productService.getProductById(id));
    }

    @GetMapping("/test")
    @Operation(summary = "Health check", description = "Test endpoint for product service")
    public String test() {
        return "Product Service Running...";
    }
}
