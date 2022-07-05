package com.example.postgresql.model;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;


@Entity(name = "ServiceDataResponse")
public class ServiceDataResponse
{
    @Id
    @SequenceGenerator(
            name = "service_data_sequence",
            sequenceName = "service_data_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "service_data_sequence"

    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;

    private String value;

    private String unit;

    private String typeServiceID;
    // TODO: Discuss with Nina since here will be the problem: since we need to know in advance the responds such that we can store it.


    public ServiceDataResponse() {}

    public ServiceDataResponse(String value, String unit, String typeServiceID)
    {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
