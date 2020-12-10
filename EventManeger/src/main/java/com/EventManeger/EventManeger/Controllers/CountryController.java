package com.EventManeger.EventManeger.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CountryController {

    @GetMapping("/countries")          //link eke wetena nama
    public String GetCountries() {

        return "country";              //link eke  namata anuwa pennan oona html file eke .html kyna tika nathuwa
    }
}
