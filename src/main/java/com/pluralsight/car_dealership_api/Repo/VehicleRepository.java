package com.pluralsight.car_dealership_api.Repo;

import com.pluralsight.car_dealership_api.Model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//JpaRepository<> the class name of the model goes first then the data type but, it cant be primitive.
// ex: Integer not int
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
    List<Vehicle> findByMinPrice(double minPrice);
    List<Vehicle> findByMaxPrice(double maxPrice);
}

