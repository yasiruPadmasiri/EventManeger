package com.EventManeger.EventManeger.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class weddingCarsController {
    @RequestMapping(value = "/weddingCars")
    public String weddingCars(){
        return "weddingCars";
    }
}
