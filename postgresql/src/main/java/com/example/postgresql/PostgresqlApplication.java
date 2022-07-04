package com.example.postgresql;

import com.example.postgresql.model.Product;
import com.example.postgresql.model.ServiceDataResponse;
import com.example.postgresql.repository.ProductRepository;
import com.example.postgresql.repository.ServiceRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@SpringBootApplication
public class PostgresqlApplication
{
	private final ProductRepository productRepository;
	private final ServiceRepository serviceRepository;

	public PostgresqlApplication(ProductRepository productRepository, ServiceRepository serviceRepository)
	{
		this.productRepository = productRepository;
		this.serviceRepository = serviceRepository;

		System.out.println("hello Vincent");
		Product product = new Product(10, "Vincent", "The best");
		this.productRepository.save(product);
		System.out.println("saved");
		serviceRepository.deleteAll();
		System.out.println(serviceRepository.count());
		ServiceDataResponse serviceDataResponse = new ServiceDataResponse(101, "1", "ms","2");
		ServiceDataResponse serviceDataResponse2 = new ServiceDataResponse(102, "2", "ms","2");
		ServiceDataResponse serviceDataResponse3 = new ServiceDataResponse(103, "3", "ms","2");
		ServiceDataResponse serviceDataResponse4 = new ServiceDataResponse(104, "4", "ms","2");
		ServiceDataResponse serviceDataResponse5 = new ServiceDataResponse(105, "5", "ms","2");
		ServiceDataResponse serviceDataResponse6 = new ServiceDataResponse(106, "6", "ms","2");
		ServiceDataResponse serviceDataResponse7 = new ServiceDataResponse(107, "7", "ms","2");
		ServiceDataResponse serviceDataResponse8 = new ServiceDataResponse(108, "8", "ms","2");
		ServiceDataResponse serviceDataResponse9 = new ServiceDataResponse(109, "9", "ms","2");
		serviceRepository.save(serviceDataResponse);
		serviceRepository.save(serviceDataResponse2);
		serviceRepository.save(serviceDataResponse3);
		serviceRepository.save(serviceDataResponse4);
		serviceRepository.save(serviceDataResponse5);
		serviceRepository.save(serviceDataResponse6);
		serviceRepository.save(serviceDataResponse7);
		serviceRepository.save(serviceDataResponse8);
		serviceRepository.save(serviceDataResponse9);
		System.out.println("service response saved in the database");
		Timestamp timestamp = Timestamp.valueOf(LocalDateTime.now());
		//System.out.println(timestamp);


	}

	public static void main(String[] args)
	{
		SpringApplication.run(PostgresqlApplication.class, args);
	}

}
