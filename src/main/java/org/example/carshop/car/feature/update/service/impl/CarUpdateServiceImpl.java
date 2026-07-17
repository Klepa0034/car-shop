package org.example.carshop.car.feature.update.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.carshop.car.feature.update.mapper.CarUpdateServiceRepositoryMapper;
import org.example.carshop.car.feature.update.model.CarUpdateDto;
import org.example.carshop.car.feature.update.repository.CarUpdateRepository;
import org.example.carshop.car.feature.update.service.CarUpdateService;
import org.example.carshop.car.model.Car;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CarUpdateServiceImpl implements CarUpdateService {
    private final CarUpdateRepository carUpdateRepository;
    private final CarUpdateServiceRepositoryMapper carUpdateMapper;

    @Override
    @Transactional
    public CarUpdateDto handle(CarUpdateDto carUpdateDto) {
        Car car = carUpdateMapper.map(carUpdateDto);
        Car saved = carUpdateRepository.save(car);
        return carUpdateMapper.map(saved);
    }
}