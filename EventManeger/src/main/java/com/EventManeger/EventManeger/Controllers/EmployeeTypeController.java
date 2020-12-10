package com.EventManeger.EventManeger.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeTypeController {

    @GetMapping("/employeeType")          //link eke wetena nama
    public String GetEmployeeType() {

        return "employeeType";              //link eke  namata anuwa pennan oona html file eke .html kyna tika nathuwa
    }
}
