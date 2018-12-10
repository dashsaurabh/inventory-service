package com.example.ariane.persistence.entities;

import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;

import java.io.Serializable;
import java.util.UUID;

@Aggregate
public class VehicleEntity implements Serializable {

    @AggregateIdentifier
    private UUID id;

    private String make;

    private String model;

    private double amount;

    private String currency;

    private String state;

    public VehicleEntity() {
    }
}
