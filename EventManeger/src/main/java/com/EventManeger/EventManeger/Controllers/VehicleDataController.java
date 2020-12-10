package com.EventManeger.EventManeger.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleDataController {
    @GetMapping("/vehicleData")          //link eke wetena  @notaion eka dana nama
    public String GetVehicleData() {

        return "vehicleData";              //link eke  namata anuwa pennan oona html file eke .html kyna tika nathuwa
    }
}
