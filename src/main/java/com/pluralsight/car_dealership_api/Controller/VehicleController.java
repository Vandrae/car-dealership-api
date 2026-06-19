package com.pluralsight.car_dealership_api.Controller;

import com.pluralsight.car_dealership_api.Model.Vehicle;
import com.pluralsight.car_dealership_api.Repo.VehicleRepository;
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
    public ResponseEntity<Vehicle> getVehicleByID(@PathVariable String id){
        return ResponseEntity.ok(vehicleService.getVehicleByID(id));
    }

    //this lets you enter the min price ex: /minprice/20000
    //the other way would be replacing PathVariable with RequestParam and adding ?price=20000 after/minprice
    @GetMapping("/minprice/{price}")
    public ResponseEntity <List <Vehicle>> getVehicleByMinPrice(@PathVariable Double price){
        return ResponseEntity.ok(vehicleService.getVehicleByMinPrice(price));
    }

    @GetMapping("/maxprice/{price}")
    public ResponseEntity <List<Vehicle>> getVehicleByMaxPrice(@PathVariable Double price){
        return ResponseEntity.ok(vehicleService.getVehicleByMaxPrice(price));
    }

    @GetMapping("/make{make}")
    public ResponseEntity <List<Vehicle>> getVehicleByMake(@PathVariable String make){
        return ResponseEntity.ok(vehicleService.getVehicleByMake(make));
    }

    //error when post "Column 'model' cannot be null"
    @PostMapping("/add")
    public ResponseEntity <Vehicle> newVehicle(@RequestBody Vehicle vehicle){
        return ResponseEntity.ok(vehicleService.createVehicle(vehicle));
    }
}
