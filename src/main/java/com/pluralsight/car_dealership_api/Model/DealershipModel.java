package com.pluralsight.car_dealership_api.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "dealerships")
public class DealershipModel {

    //@Id assigns as primary key
    @Id
    //auto generates and increments on newly created fields
    /*ex:
    id: 1 name: bob
    id: 2 name: justin
    id: 3 name: mark
    id: 4 name: dave
    */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dealershipId;

    private String name;

    private String address;

    private String phone;

    public int getDealershipId() {
        return dealershipId;
    }

    public void setDealershipId(int dealershipId) {
        this.dealershipId = dealershipId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
