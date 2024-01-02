package com.sternitc.validator.domain;

import jakarta.validation.constraints.NotEmpty;

public class Car extends Vehicle {

    public Car(String brand, int minSpeed) {
        super(minSpeed);
        this.brand = brand;
    }

    @NotEmpty(message = "Brand of a vehicle is mandatory.")
    private final String brand;

    public String getBrand() {
        return brand;
    }
}
