package com.example.demo_teacher.Controller;

import com.example.demo_teacher.entites.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    public List<User> listuser;

    public UserController() {
        listuser = new ArrayList<User>();
        listuser.add(new User(1, "Nguyễn Thành Linh "));
        listuser.add(new User(2, "Lê Văn An"));
        listuser.add(new User(3,"Võ Thị Tín"));

    }
    @GetMapping("/list")
    public String ListUsers(Model model) {
        model.addAttribute("listuser", listuser);
        return "users/list";
    }

    @GetMapping("/{id}/delete")
    public String DeleteUser(@PathVariable int id, Model model) {
        System.out.println(id);
        listuser.removeIf(user -> user.getId() == id);
        return "redirect:/users/list"   ;
    }

    @GetMapping("/add")
    public String showFormAdd(Model model) {
        return "users/add";
    }

    @PostMapping("/add")
    public String addUser(@ModelAttribute("name") String name ) {
        User lastuser = listuser.get(listuser.size()-1);
        listuser.add(new User(lastuser.getId() + 1, name));
        return "redirect:/users/list";

    }
}
