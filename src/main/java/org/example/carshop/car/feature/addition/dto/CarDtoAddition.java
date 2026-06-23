package org.example.carshop.car.feature.addition.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
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