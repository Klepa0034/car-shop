package org.example.carshop.car.feature.delete.service;

import lombok.AllArgsConstructor;
import org.example.carshop.car.feature.delete.repository.CarDeleteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarDeleteServiceImpl implements CarDeleteService {
    private final CarDeleteRepository carDeleteRepository;
    @Override
    public void handle(Long id) {
        carDeleteRepository.deleteById(id);
    }
}