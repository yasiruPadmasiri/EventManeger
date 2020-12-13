package com.EventManeger.EventManeger.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class updateCountry {

    @GetMapping("/updateCountry")          //link eke wetena nama
    public String GetEmployee() {

        return "countryUpdate";              //link eke  namata anuwa pennan oona html file eke .html kyna tika nathuwa
    }
}
