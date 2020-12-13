package com.EventManeger.EventManeger.Controllers;

import com.EventManeger.EventManeger.Models.Country;
import com.EventManeger.EventManeger.Services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class CountryController {

    public Optional<Country> findCountry;
    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")          //link eke wetena nama
    public String GetCountries(Model model) {

        List<Country> countryList=countryService.getCountries();
        model.addAttribute("countries",countryList);
        return "country";              //link eke  namata anuwa pennan oona html file eke .html kyna tika nathuwa
    }
    @PostMapping("/countries/addNew")
    public String addNew(Country country){
        countryService.save(country);
        return  "redirect:/countries";
    }

//    @RequestMapping("/countries/update")
//    @PutMapping
//    public String GetCountriesFind(Model models,int id) {
//
//        Optional<Country> ScountryList=countryService.findById(id);
//
//        models.addAttribute("countrie",ScountryList);
//        return "country";              //link eke  namata anuwa pennan oona html file eke .html kyna tika nathuwa
//    }
    @RequestMapping(value = "/countries/delete" ,method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id){
        countryService.delete(id);
        return  "redirect:/countries";

    }
    @RequestMapping("/countries/findById")
    @ResponseBody
    public Optional<Country> findById(int id){
        return countryService.findById(id);
    }



}
