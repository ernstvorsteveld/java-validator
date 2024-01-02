package com.sternitc.validator.domain;

import jakarta.validation.constraints.Min;

public class Ship extends Vehicle {

    @Min(message = "A ship has minimum length of 50", value = 50)
    private final int length;

    public Ship(int length, int minSpeed) {
        super(minSpeed);
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
