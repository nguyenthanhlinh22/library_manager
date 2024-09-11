package com.example.demoex;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="loginServlet", urlPatterns = "login")
public class LoginServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("LoginServlet initialized");
        // Initialize values or connect to the database
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Handle GET request to /login
        resp.setContentType("text/html");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("Login.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Handle POST request to /login
        // Process login information here

        // For example, you can retrieve the form data as follows:
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        // Perform authentication logic here

        // For now, just forward to login.jsp again
        resp.setContentType("text/html");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("Login.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    public void destroy() {
        // Cleanup code if needed
    }
}
