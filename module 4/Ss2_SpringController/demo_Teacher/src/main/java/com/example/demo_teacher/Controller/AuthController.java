package com.example.demo_teacher.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/auth")
public class AuthController {
    @GetMapping("/login")
    public String FormLogin(@RequestParam(value = "error", required = false) String error, Model model) {
        if(error != null) {
            model.addAttribute("errorMessage", "Account not exist !");
        }else {
            model.addAttribute("successMessage", "You have successfully logged in!");
        }
        return "auth/login";
    }

    @PostMapping("/login")

    public String Login(@RequestParam String userName, @RequestParam String pass, Model model){
        System.out.println("userName : "  + userName + " " + "Pass : " + pass);
        if(userName.equals("thanhlinh") && pass.equals("123")){
            return "redirect:/admin";
        }
        return "redirect:/auth/login?error=true";

    }
}
