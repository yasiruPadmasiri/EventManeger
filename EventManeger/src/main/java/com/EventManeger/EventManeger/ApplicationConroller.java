package com.EventManeger.EventManeger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationConroller {
    @GetMapping("/index")
    public String GoHome() {

        return "index";
    }

}
