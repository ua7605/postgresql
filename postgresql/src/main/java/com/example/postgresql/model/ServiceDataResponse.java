package com.example.postgresql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ServiceDataResponse
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long timestamp;

    private String value;

    private String Unit;

    private String typeServiceID;
    // TODO: Discuss with Nina since here will be the problem: since we need to know in advance the responds such that we can store it.


}
