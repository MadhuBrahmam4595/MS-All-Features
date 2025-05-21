package com.ProductServiceProducer.controller;

import com.ProductServiceProducer.entity.Product;
import com.ProductServiceProducer.repo.ProductRepo;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
public class ProductController {

    private final ProductRepo productRepo;

    public ProductController(ProductRepo productRepo){
        this.productRepo = productRepo;
    }

    @GetMapping("{id}")
    @Operation(summary = "Getting Product By Id", description = "You need to give Product id for getting product from db.")
    public ResponseEntity<Product> getProductById(@PathVariable Long id){
        return productRepo.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Saving new Prodct", description = "Inserting new product into the database")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
        return ResponseEntity.ok(productRepo.save(product));
    }
}
