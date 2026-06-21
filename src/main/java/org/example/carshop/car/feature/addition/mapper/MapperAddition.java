package org.example.carshop.car.feature.addition.mapper;

import lombok.Getter;
import lombok.Setter;
import org.example.carshop.car.feature.addition.dto.CarDtoAddition;
import org.example.carshop.car.model.Car;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public class MapperAddition {

   public Car toCar(CarDtoAddition carDtoAddition){
        return new Car();
    }

    public CarDtoAddition toCarDtoAddition(Car car){
        return new CarDtoAddition();
    }

}
