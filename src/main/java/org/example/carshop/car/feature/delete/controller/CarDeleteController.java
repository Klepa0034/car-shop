package org.example.carshop.car.feature.delete.controller;

import lombok.RequiredArgsConstructor;
import org.example.carshop.car.feature.delete.model.CarDeleteResponse;
import org.example.carshop.car.feature.delete.service.CarDeleteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/cars")
public class CarDeleteController {
    private final CarDeleteService carDeleteService;

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete (@PathVariable Long id){
         carDeleteService.handle(id);
         return ResponseEntity.noContent().build();
    }
}