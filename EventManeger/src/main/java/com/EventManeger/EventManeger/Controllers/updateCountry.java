package com.EventManeger.EventManeger.Controllers;

import com.EventManeger.EventManeger.Services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class updateCountry {

    @RequestMapping("/countryUpdate")//link eke wetena nama
    public String scountryId() {
//countryService.findById();
        return "countryUpdate";              //link eke  namata anuwa pennan oona html file eke .html kyna tika nathuwa
    }
}
