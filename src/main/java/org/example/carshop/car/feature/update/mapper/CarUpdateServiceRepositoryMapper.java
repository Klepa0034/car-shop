package org.example.carshop.car.feature.update.mapper;

import org.example.carshop.car.feature.update.model.CarUpdateDto;
import org.example.carshop.car.model.Car;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface CarUpdateServiceRepositoryMapper {
    Car map (CarUpdateDto carUpdateDto);
    CarUpdateDto map (Car car);

}
