package com.EventManeger.EventManeger.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping("/employee")          //link eke wetena nama
    public String GetEmployee() {

        return "employee";              //link eke  namata anuwa pennan oona html file eke .html kyna tika nathuwa
    }
}
