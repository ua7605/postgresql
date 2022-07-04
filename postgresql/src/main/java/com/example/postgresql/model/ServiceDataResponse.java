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
    private Integer id;

    private String value;

    private String unit;

    private String typeServiceID;
    // TODO: Discuss with Nina since here will be the problem: since we need to know in advance the responds such that we can store it.


    public ServiceDataResponse() {}

    public ServiceDataResponse(Integer id, String value, String unit, String typeServiceID)
    {
        this.id = id;
        this.value = value;
        this.unit = unit;
        this.typeServiceID = typeServiceID;
    }



    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getTypeServiceID() {
        return typeServiceID;
    }

    public void setTypeServiceID(String typeServiceID) {
        this.typeServiceID = typeServiceID;
    }

    public long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
