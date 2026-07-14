package org.example.carshop.car.feature.receiving.service;

import org.example.carshop.car.feature.receiving.model.CarReceiveDto;
import org.example.carshop.car.feature.receiving.model.CarReceiveListDto;

import java.util.List;

public interface CarReceivingService {
    CarReceiveListDto handle();
}
