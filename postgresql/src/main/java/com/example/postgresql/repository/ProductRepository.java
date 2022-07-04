package com.example.postgresql.repository;

import com.example.postgresql.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// SO IN <what you want to store, what the type of the id is>
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>
{

}
