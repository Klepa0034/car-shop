package org.example.carshop.car.feature.receiving.mapper;

import org.example.carshop.car.feature.receiving.model.CarReceiveDto;
import org.mapstruct.Named;
import org.springframework.stereotype.Component;

@Component
public class CarStateMapper {
    @Named("map")
    public String map(CarReceiveDto carReceiveDto) {
        return carReceiveDto.year() > 20 ? "ХУЕВОЕ" : "Прекрасное";
    }
}
