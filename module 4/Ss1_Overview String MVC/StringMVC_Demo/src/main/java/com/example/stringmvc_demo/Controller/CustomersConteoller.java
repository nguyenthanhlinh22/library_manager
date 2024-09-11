package com.example.stringmvc_demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class CustomersConteoller {
    @GetMapping("/customer")
    public String showList(Model model) {
        return "Customer/list";
    }
}
