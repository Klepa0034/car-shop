package org.example.carshop.car.feature.update.repository;

import org.example.carshop.car.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarUpdateRepository extends JpaRepository<Car,Long> {
}
