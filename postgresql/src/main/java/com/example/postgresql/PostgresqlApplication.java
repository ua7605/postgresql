package com.example.postgresql;

import com.example.postgresql.model.Product;
import com.example.postgresql.repository.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@SpringBootApplication
public class PostgresqlApplication
{
	private final ProductRepository productRepository;

	public PostgresqlApplication(ProductRepository productRepository)
	{
		this.productRepository = productRepository;
		System.out.println("hello Vincent");
		Product product = new Product(10, "Vincent", "The best");
		this.productRepository.save(product);
		System.out.println("saved");

		Timestamp timestamp = Timestamp.valueOf(LocalDateTime.now());
		System.out.println(timestamp);
	}

	public static void main(String[] args)
	{
		SpringApplication.run(PostgresqlApplication.class, args);
	}

}
