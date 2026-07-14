package org.example.carshop.car.feature.receiving.mapper;

import org.example.carshop.car.feature.receiving.model.CarReceiveDto;
import org.example.carshop.car.feature.receiving.model.CarReceiveListDto;
import org.example.carshop.car.feature.receiving.model.CarReceiveListResponse;
import org.example.carshop.car.feature.receiving.model.CarReceiveResponse;
import org.example.carshop.car.model.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR, uses = CarStateMapper.class)
public interface CarReceiveMapper {
    default CarReceiveListDto map(List<Car> carList) {
        List<CarReceiveDto> list = carList.stream().map(this::map).toList();
        return new CarReceiveListDto(list);
    }

    CarReceiveListResponse map(CarReceiveListDto dto);

    @Mapping(target = "state", source = ".", qualifiedByName = "map")
    public CarReceiveResponse map(CarReceiveDto dto);

    public CarReceiveDto map(Car car);
}
