package com.pluralsight.car_dealership_api.Service;

import com.pluralsight.car_dealership_api.Model.Vehicle;
import com.pluralsight.car_dealership_api.Repo.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    private VehicleRepository vehicleRepo;

    public VehicleService(VehicleRepository vehicleRepo) {
        this.vehicleRepo = vehicleRepo;
    }

    public List<Vehicle> getAllVehicles(){
        return vehicleRepo.findAll();
    }
        //i dont really understand this
    public Vehicle getVehicleByID(String id){
        return vehicleRepo.findById(id)
                .orElseThrow(()-> new RuntimeException("Id not found"));
    }

    public List<Vehicle> getVehicleByMinPrice(double price){
        return vehicleRepo.findByPriceLessThanEqual(price);
    }

    public List<Vehicle> getVehicleByMaxPrice(double price){
        return vehicleRepo.findByPriceGreaterThanEqual(price);
    }

    public List<Vehicle> getVehicleByMake(String make){
        return vehicleRepo.findByMake(make);
    }
}
