package org.example.carshop.car.feature.addition.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Entity
public class CarDtoAddition {
    @Id
    Long id;
    String model;
    String brand;
    int year;
    int mileage;
    int owner;
    BigDecimal tax;
    String state;
    String pts;
    String custom;
    String equipment;
    String engine;
    String transmission;
    String drive;
    String wheel;
    String body;
    String color;
}
