package com.sternitc.validator.domain;

import jakarta.validation.constraints.Min;

public class Vehicle {

    public Vehicle(int minSpeed) {
        this.minSpeed = minSpeed;
    }

    @Min(message = "Minimum speed of a vehicle should be equal or more than 1", value = 1)
    private final int minSpeed;

    public int getMinSpeed() {
        return minSpeed;
    }
}
