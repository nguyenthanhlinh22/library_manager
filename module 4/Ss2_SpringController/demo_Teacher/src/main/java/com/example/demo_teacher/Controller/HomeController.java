package com.example.demo_teacher.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
    @GetMapping
    //Model ở đây là tiem sự phụ thuộc , Model ở đây là một object
    public String home(Model model) {
        //truyền dữ liệu sang view
        model.addAttribute("message", "Hello World");
        return "home";
    }
}
