package com.pluralsight.car_dealership_api.Controller;

import com.pluralsight.car_dealership_api.Service.DealershipService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dealership")

public class DealershipController {
    private DealershipService dealershipService;

    public DealershipController(DealershipService dealershipService){
        this.dealershipService= dealershipService;
    }
}
