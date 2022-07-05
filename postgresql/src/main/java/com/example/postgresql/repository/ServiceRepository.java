package com.example.postgresql.repository;

import com.example.postgresql.model.ServiceDataResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;


@Repository
public interface ServiceRepository extends JpaRepository<ServiceDataResponse, Long>
{
}
