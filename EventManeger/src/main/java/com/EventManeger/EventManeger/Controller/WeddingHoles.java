package com.EventManeger.EventManeger.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WeddingHoles {
    @RequestMapping(value = "/weddingHoles")
    public String GoWeddingHolesView(){
        return "weddingHoles";
    }

    @GetMapping("weddingHolesSearch")
    public String WeddingHoleSearchView(){
        return "weddingHolesSearchView";
    }
}
