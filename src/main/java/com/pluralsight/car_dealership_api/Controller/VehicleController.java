package com.pluralsight.car_dealership_api.Controller;

import com.pluralsight.car_dealership_api.Model.Vehicle;
import com.pluralsight.car_dealership_api.Service.VehicleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        return ResponseEntity.ok(vehicleService.getVehicleByID(id));
    }

    @GetMapping("/minprice")
    public ResponseEntity <List <Vehicle>> getVehicleByMinPrice(double price){
        return ResponseEntity.ok(vehicleService.getVehicleByMinPrice(price));
    }

    @GetMapping("/maxprice")
    public ResponseEntity <List<Vehicle>> getVehicleByMaxPrice(double price){
        return ResponseEntity.ok(vehicleService.getVehicleByMinPrice(price));
    }

    @GetMapping("/make")
    public ResponseEntity <List<Vehicle>> getVehicleByMake(String make){
        return ResponseEntity.ok(vehicleService.getVehicleByMake(make));
    }
}
