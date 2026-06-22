package org.example.carshop.car.feature.addition.repository;

import org.example.carshop.car.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

/**Данный репозиторий предназначен для функии addition **/

public interface RepositoryAddition extends JpaRepository<Car, Long> {
}