package org.example.carshop.car.feature.receiving.controller;

import lombok.RequiredArgsConstructor;
import org.example.carshop.car.feature.receiving.mapper.CarReceiveMapper;
import org.example.carshop.car.feature.receiving.model.CarReceiveDto;
import org.example.carshop.car.feature.receiving.model.CarReceiveListDto;
import org.example.carshop.car.feature.receiving.model.CarReceiveListResponse;
import org.example.carshop.car.feature.receiving.model.CarReceiveResponse;
import org.example.carshop.car.feature.receiving.service.CarReceivingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@RequiredArgsConstructor
public class CarReceivingController {
    private final CarReceivingService carReceivingService;
    private final CarReceiveMapper carReceivingMapper;

    @GetMapping
    CarReceiveListResponse findAll() {
        CarReceiveListDto dtos = carReceivingService.handle();
        return carReceivingMapper.map(dtos);
    }
}
