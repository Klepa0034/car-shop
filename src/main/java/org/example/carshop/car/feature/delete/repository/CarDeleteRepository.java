package org.example.carshop.car.feature.delete.repository;

import org.example.carshop.car.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDeleteRepository extends JpaRepository<Car,Long> {
}
