package org.example.carshop.car.feature.addition.mapper;

import org.example.carshop.car.feature.addition.dto.CarDtoAddition;
import org.example.carshop.car.model.Car;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperAddition {

    Car map(CarDtoAddition carDtoAddition);

    CarDtoAddition map(Car car);
}