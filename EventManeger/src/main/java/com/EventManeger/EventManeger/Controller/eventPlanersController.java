package com.EventManeger.EventManeger.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class eventPlanersController {
    @RequestMapping(value = "/eventPlaners")
    public String eventPlaners(){
        return "eventPlaners";

    }
}
