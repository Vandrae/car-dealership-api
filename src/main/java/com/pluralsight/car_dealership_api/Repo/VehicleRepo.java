package com.pluralsight.car_dealership_api.Repo;

import com.pluralsight.car_dealership_api.Model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//JpaRepository<> the class name of the model goes first then the data type but, it cant be primitive.
// ex: Integer not int
public interface VehicleRepo extends JpaRepository<Vehicle, Integer> {

}
