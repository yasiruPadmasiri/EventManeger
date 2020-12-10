package com.EventManeger.EventManeger.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleTypeController {
    @GetMapping("/vehicleType")
    public String GoVehicleType() {

        return "vehicleType";
    }
}
