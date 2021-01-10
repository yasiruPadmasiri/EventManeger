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

    @RequestMapping(value = "cakes_add_publish")
    public String cakes_add_publish(){
        return "cake_add_publish";
    }
}
