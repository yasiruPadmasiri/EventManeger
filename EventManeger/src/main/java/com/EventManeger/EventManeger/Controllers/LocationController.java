package com.EventManeger.EventManeger.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LocationController {

    @GetMapping("/location")          //link eke wetena nama
    public String GetLocation() {

        return "location";              //link eke  namata anuwa pennan oona html file eke .html kyna tika nathuwa
    }
}
