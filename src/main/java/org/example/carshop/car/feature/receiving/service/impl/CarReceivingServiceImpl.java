package org.example.carshop.car.feature.receiving.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.carshop.car.feature.receiving.mapper.CarReceiveMapper;
import org.example.carshop.car.feature.receiving.model.CarReceiveDto;
import org.example.carshop.car.feature.receiving.model.CarReceiveListDto;
import org.example.carshop.car.feature.receiving.repositroy.CarReceivingRepository;
import org.example.carshop.car.feature.receiving.service.CarReceivingService;
import org.example.carshop.car.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarReceivingServiceImpl implements CarReceivingService {
    private final CarReceivingRepository carReceivingRepository;
    private final CarReceiveMapper carReceivingMapper;

    @Override
    public CarReceiveListDto handle() {
        List<Car> cars = carReceivingRepository.findAll();
        return carReceivingMapper.map(cars);
    }
}