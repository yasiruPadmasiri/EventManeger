package com.EventManeger.EventManeger.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class cakesController {
    @RequestMapping(value = "/cakes")
    public String cakes(){
        return "cakes";

    }

    @RequestMapping(value = "cakeSearch")
    public String cakeSearch(){
        return "cakeSearch";
    }
}
