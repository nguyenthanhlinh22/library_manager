package com.example.demo01;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HomeServlet" , urlPatterns = "/dashboard")
public class HomeServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("home servlet init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       RequestDispatcher rd = req.getRequestDispatcher("views/dashboard.jsp");
    }
}
