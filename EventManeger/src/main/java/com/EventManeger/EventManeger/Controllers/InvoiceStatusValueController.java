package com.EventManeger.EventManeger.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoiceStatusValueController {

    @GetMapping("/invoiceStatus")          //link eke wetena nama
    public String GetInvoiceStatus() {

        return "invoiceStatus";              //link eke  namata anuwa pennan oona html file eke .html kyna tika nathuwa
    }

}
