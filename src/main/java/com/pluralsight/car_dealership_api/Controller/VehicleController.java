package com.pluralsight.car_dealership_api.Controller;

import com.pluralsight.car_dealership_api.Model.Vehicle;
import com.pluralsight.car_dealership_api.Service.VehicleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//use @restcontroller instead of controller
@RestController
@RequestMapping("/api/products")
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService){
        this.vehicleService = vehicleService;
    }

    @GetMapping
    public List<Vehicle> getAllVehicles(){
        return vehicleService.getAllVehicles();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Vehicle> getVehicleByID(@PathVariable int id){
        return VehicleService.getVehicleByID(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
