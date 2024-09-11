package com.example.elearning.models;

import com.example.elearning.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserModel {
    private final List<User> listUser;

    public UserModel() {
        listUser = new ArrayList<>();
        listUser.add(new User(1, "thànhlinh", "thanhlih@gmail.com",1));
        listUser.add(new User(2, "anh do mixxi", "thanhlih@gmail.com", 2));
        listUser.add(new User(3, "thànhlinh", "thanhlih@gmail.com",3 ));


    }


    public List<User> getListUser() {
        return listUser;
    }
    public void deleteUser(int id) {
        listUser.removeIf(user -> user.getId() == id);
    }

    public void addUser(User user) {
        listUser.add(user);
    }
}
