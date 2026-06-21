package org.example.carshop.car.feature.addition.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.carshop.car.feature.addition.dto.CarDtoAddition;
import org.example.carshop.car.feature.addition.mapper.MapperAddition;
import org.example.carshop.car.feature.addition.repository.RepositoryAddition;
import org.example.carshop.car.feature.addition.service.ServiceAddition;
import org.example.carshop.car.model.Car;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServiceAdditionImpl implements ServiceAddition {

    private final RepositoryAddition repositoryAddition;
    private final MapperAddition mapperAddition;

    @Override
    public CarDtoAddition CarAddition(CarDtoAddition carDtoAddition) {

        Car car = mapperAddition.toCar(carDtoAddition);
        Car addition = repositoryAddition.save(car);
        return mapperAddition.toCarDtoAddition(addition);
    }
}
