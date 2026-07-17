package org.example.carshop.car.feature.update.service;

import org.example.carshop.car.feature.update.model.CarUpdateDto;

public interface CarUpdateService {
    CarUpdateDto handle( CarUpdateDto carUpdateDto);
}