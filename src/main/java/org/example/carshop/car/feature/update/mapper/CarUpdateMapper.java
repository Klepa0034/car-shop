package org.example.carshop.car.feature.update.mapper;

import org.example.carshop.car.feature.update.model.CarUpdateDto;
import org.example.carshop.car.feature.update.model.CarUpdateRequest;
import org.example.carshop.car.feature.update.model.CarUpdateResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface CarUpdateMapper {
    CarUpdateResponse map (CarUpdateDto carUpdateDto);
    @Mapping(target = "id", source = "id")
    CarUpdateDto map (Long id, CarUpdateRequest carUpdateRequest);
}