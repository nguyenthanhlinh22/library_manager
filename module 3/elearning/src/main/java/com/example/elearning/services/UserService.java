package com.example.elearning.services;

import com.example.elearning.entity.User;
import com.example.elearning.models.UserModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class UserService {

    private final UserModel userModel;

    public UserService() {
        userModel = new UserModel();
    }

    //render
    public void renderPageUserList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users = this.userModel.getListUser();
        req.setAttribute("users", users);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/users/list.jsp");
        requestDispatcher.forward(req, resp);
    }

    public void renderCreateUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/users/create.jsp");
        requestDispatcher.forward(req, resp);

    }
    public void renderUpdateUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users = this.userModel.getListUser();
        req.setAttribute("users", users);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/users/update.jsp");
        requestDispatcher.forward(req, resp);
    }


    //action
    public void DeleteUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        this.userModel.deleteUser(id);
        resp.sendRedirect("/users");
    }

    public void CreateUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        int role = Integer.parseInt(req.getParameter("role"));
        User user = new User(id, name, email, role);
        this.userModel.addUser(user);
        resp.sendRedirect("/users");
    }

   


}
