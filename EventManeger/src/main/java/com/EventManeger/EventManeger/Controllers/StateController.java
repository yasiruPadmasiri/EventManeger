package com.EventManeger.EventManeger.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StateController {
    @GetMapping("/state")
    public String GoState() {

        return "state";
    }
}
