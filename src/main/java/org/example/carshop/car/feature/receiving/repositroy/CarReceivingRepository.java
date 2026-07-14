package org.example.carshop.car.feature.receiving.repositroy;

import org.example.carshop.car.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarReceivingRepository extends JpaRepository<Car,Long> {
}
