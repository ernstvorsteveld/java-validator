package com.sternitc.validator.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(classes = {
        ValidationAutoConfiguration.class
})
public class VehicleValidatorTest {

    @Autowired
    private Validator validator;


    @Test
    public void should_validate_car_and_ship() {
        Car car = new Car("Maserati", 10);
        Errors errors = validator.validateObject(car);
        assertFalse(errors.hasErrors());

        Ship ship = new Ship(100, 1);
        errors = validator.validateObject(car);
        assertFalse(errors.hasErrors());

        ship = new Ship(20, 1);
        errors = validator.validateObject(ship);
        assertTrue(errors.hasErrors());
        FieldError fieldError = errors.getFieldErrors().get(0);
        assertEquals(fieldError.getField(), "length");
    }
}
