package com.example.demo_teacher.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping
    public String index(Model model) {
        return "admin/index";
    }

    @GetMapping("/user/{id}")
    public String user(@PathVariable int id, Model model) {
        return "admin/user";
    }
}
