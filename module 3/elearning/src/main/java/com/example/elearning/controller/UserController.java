package com.example.elearning.controller;

import com.example.elearning.services.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserController", urlPatterns = {"/users/*"})
public class UserController extends HttpServlet {
    private UserService userService;
    @Override
    public void init() throws ServletException {
        this.userService = new UserService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getPathInfo();
        System.out.println(url);
        if(url == null){
            this.userService.renderPageUserList(req, resp);
            return;
        }
        switch (url) {
            case "/delete":
                this.userService.DeleteUser(req, resp);
                break;
            case "/create":
                this.userService.renderCreateUser(req, resp);
                break;
            case "update":
                this.userService.renderUpdateUser(req, resp);


            default:

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.userService.CreateUser(req, resp);
    }
}
