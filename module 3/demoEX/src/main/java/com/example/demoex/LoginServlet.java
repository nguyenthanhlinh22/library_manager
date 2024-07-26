package com.example.demoex;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="Login", urlPatterns = "login")
public class LoginServlrt extends HttpServlet {
    @Override
    public void init() throws ServletException {

        System.out.println("LoginServlrt");
        //Tao gia tri ban dau or connrct csdl
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        //xi li req url : /login vith method get
        resp.setContentType("text/html");

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("login.jsp");
       requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
