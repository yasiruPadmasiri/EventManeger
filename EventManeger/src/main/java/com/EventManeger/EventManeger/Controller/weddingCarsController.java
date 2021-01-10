package com.EventManeger.EventManeger.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class weddingCarsController {
    @RequestMapping(value = "/weddingCars")
    public String weddingCars(){
        return "weddingCars";
    }
    @RequestMapping(value = "weddingCar_Search")
    public String weddingCar_Search(){
        return "weddingcarSearch";
    }
    @RequestMapping(value = "/weddingCar_add_publish")
    public String weddingCar_add_publish(){
        return "weddingCar_add_publish ";
    }
}
