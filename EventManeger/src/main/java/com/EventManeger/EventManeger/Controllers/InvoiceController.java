package com.EventManeger.EventManeger.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoiceController {

    @GetMapping("/invoice")
    public String Goinvoice() {

        return "invoice";
    }
}
