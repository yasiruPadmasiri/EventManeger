package com.EventManeger.EventManeger.Controllers;

import com.EventManeger.EventManeger.Models.Country;
import com.EventManeger.EventManeger.Services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")          //link eke wetena nama
    public String GetCountries(Model model) {

        List<Country> countryList=countryService.getCountries();
        model.addAttribute("countries",countryList);
        return "country";              //link eke  namata anuwa pennan oona html file eke .html kyna tika nathuwa
    }
}
