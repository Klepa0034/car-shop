package org.example.carshop.car.feature.addition.repository;

import org.example.carshop.car.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface RepositoryAddition extends JpaRepository<Car, Long> {

}