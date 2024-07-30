package com.example.library_manager.controller;

import com.example.library_manager.service.BookService;
import com.example.library_manager.service.CategoryService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "BookController", urlPatterns = "/books/*")
public class BookController extends HttpServlet {
   private BookService bookService;
   private CategoryService categoryService;

    //init
    @Override
    public void init() throws ServletException {
        this.bookService = new BookService();
        this.categoryService = new CategoryService();
    }

    //get


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getPathInfo();
            try {
                if (url == null || url.equals("/")) {
                    this.bookService.renderListBooks(req, resp);
                }
                switch (url){
                    case "/delete":
                        this.bookService.deleteBook(req, resp);
                        resp.sendRedirect("/books");
                        break;
                    case "/create":
                        this.bookService.renderCreateBook(req, resp);
                       break;
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

    }
}
