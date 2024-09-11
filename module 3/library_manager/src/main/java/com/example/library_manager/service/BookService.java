package com.example.library_manager.service;

import com.example.library_manager.entity.Book;
import com.example.library_manager.entity.Category;
import com.example.library_manager.model.BookModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookService {
    private final BookModel bookModel;
    private final CategoryService CategoryService;

    public BookService(){
        this.bookModel = new BookModel();
        this.CategoryService = new CategoryService();

    }


    public void renderListBooks(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, SQLException {
        //lấy dữ liệu từ data
        List<Book> books = this.getAllBooks();
        //pass data to view
        req.setAttribute("books", books);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/books/list.jsp");
        requestDispatcher.forward(req, resp);
    }

    public void renderCreateBook(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, SQLException {
        //lay danh sach cac the loai trong csdl
            List<Category> categories = this.CategoryService.getAllCategory();
         //pass data to from
            req.setAttribute("categories", categories);



        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/books/create.jsp");
        requestDispatcher.forward(req, resp);
    }


    public List<Book> getAllBooks() throws SQLException {
        List<Book> books = new ArrayList<>();
        ResultSet resultSet = this.bookModel.getAllBooks();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String description = resultSet.getString("description");
            int price = resultSet.getInt("price");
            int category_id = resultSet.getInt("category_id");

            Book book = new Book( name, description, price, category_id);
            book.setId(id);
            books.add(book);

        }
        return books;
    };


    public void deleteBook(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, SQLException {
        int id = Integer.parseInt(req.getParameter("id"));
        this.bookModel.destroyBook(id);

    };

    public void createBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException  {
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String price = request.getParameter("price");
        String category_id = request.getParameter("category_id");

        int priceInt = Integer.parseInt(price);

        Book book = new Book(name, description, priceInt , Integer.parseInt(category_id));
        this.bookModel.store(book);
    }

}
