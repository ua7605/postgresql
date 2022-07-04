package com.example.postgresql.controller;

import com.example.postgresql.repository.ProductRepository;
import com.example.postgresql.repository.ServiceRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController
{
    private final ProductRepository productRepository;
    private final ServiceRepository serviceRepository;

    public ProductController(ProductRepository productRepository, ServiceRepository serviceRepository)
    {
        // The bean will be injected.
        this.productRepository = productRepository;
        this.serviceRepository = serviceRepository;
    }

    @GetMapping
    public ResponseEntity getAllProducts()
    {
        return ResponseEntity.ok(this.productRepository.findAll());
    }

    @GetMapping(path = "service")
    public ResponseEntity getAllServices()
    {
        return ResponseEntity.ok(this.serviceRepository.findAll());
    }


    @GetMapping(path = "hello")
    public String helloWorld()
    {
        return "Hello world!";
    }
}
