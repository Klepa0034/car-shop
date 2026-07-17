package org.example.carshop.car.feature.update.model;

import java.math.BigDecimal;

public record CarUpdateDto(Long id,
                           String model,
                           String brand,
                           int year,
                           int mileage,
                           int owner,
                           BigDecimal tax,
                           String state,
                           String pts,
                           String custom,
                           String equipment,
                           String engine,
                           String transmission,
                           String drive,
                           String wheel,
                           String body,
                           String color) {
}