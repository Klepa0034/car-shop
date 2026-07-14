package org.example.carshop.car.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

/**
 * Сущность автомобиля для автосалона.
 * Представляет полную информацию о транспортном средстве.
 **/
@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "cars")
@ToString
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
