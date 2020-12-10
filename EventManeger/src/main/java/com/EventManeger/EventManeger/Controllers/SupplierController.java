package com.EventManeger.EventManeger.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SupplierController {
    @GetMapping("/supplier")          //link eke wetena nama
    public String GetSupplier() {

        return "supplier";              //link eke  namata anuwa pennan oona html file eke .html kyna tika nathuwa
    }
}
