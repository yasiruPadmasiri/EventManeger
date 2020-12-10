package com.EventManeger.EventManeger.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleStatusValueController {
    @GetMapping("/statusValue")          //link eke wetena nama
    public String GetVehicleStatesValue() {

        return "statusValue";              //link eke  namata anuwa pennan oona html file eke .html kyna tika nathuwa
    }
}
