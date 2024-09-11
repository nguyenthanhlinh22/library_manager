package com.example.customer_manager.controller;

import com.example.customer_manager.service.CustomerService;
import com.example.customer_manager.service.CustomerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "CustomerController",
        urlPatterns = "/customers"
)
public class CustomerController extends HttpServlet {
    private final CustomerService customerService = new CustomerServiceImpl();


    @Override
    public void init() throws ServletException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");

        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":


                break;
            case "edit":
                break;
            case "delete":
                this.customerService.deleteAllCustomers(req, resp);
                break;
            default:
                break;
        }
    }
}
