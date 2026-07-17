package org.example.carshop.car.feature.delete.controller;

import lombok.RequiredArgsConstructor;
import org.example.carshop.car.feature.delete.service.CarDeleteService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cars")
@RequiredArgsConstructor
public class CarDeleteController {
    private final CarDeleteService carDeleteService;

    @DeleteMapping("/{id}")
    void delete (@PathVariable Long id){
        carDeleteService.handle(id);
    }
}

