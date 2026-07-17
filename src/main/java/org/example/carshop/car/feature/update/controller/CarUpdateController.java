package org.example.carshop.car.feature.update.controller;

import lombok.RequiredArgsConstructor;
import org.example.carshop.car.feature.update.mapper.CarUpdateMapper;
import org.example.carshop.car.feature.update.model.CarUpdateDto;
import org.example.carshop.car.feature.update.model.CarUpdateRequest;
import org.example.carshop.car.feature.update.model.CarUpdateResponse;
import org.example.carshop.car.feature.update.service.CarUpdateService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cars")
@RequiredArgsConstructor
public class CarUpdateController {
    private final CarUpdateService carUpdateService;
    private final CarUpdateMapper carUpdateMapper;

    @PutMapping("/{id}")
    public CarUpdateResponse update(@PathVariable Long id, @RequestBody CarUpdateRequest carUpdateRequest) {
        CarUpdateDto request = carUpdateMapper.map(id,carUpdateRequest);
        CarUpdateDto handle = carUpdateService.handle(request);
        return carUpdateMapper.map(handle);
    }
}