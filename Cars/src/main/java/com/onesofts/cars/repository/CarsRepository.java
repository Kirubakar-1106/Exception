package com.onesofts.cars.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onesofts.cars.entity.Cars;

public interface CarsRepository extends JpaRepository<Cars,Integer> {


}
