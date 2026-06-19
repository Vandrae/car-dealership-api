package com.pluralsight.car_dealership_api.Model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;

@Entity
@Table(name = "vehicles")
//orders the json output in a specific order
@JsonPropertyOrder(
        {
            "vin",
            "year",
            "make",
            "model",
            "vehicleType",
            "color",
            "odometer",
            "price"
        })

public class Vehicle {
    @Id
    private String vin;

    @Column(columnDefinition = "YEAR")
    private int year;

    private String make;

    private String model;

    private String vehicleType;

    private String color;

    private int odometer;

    private double price;

    //Getter/Setters
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

