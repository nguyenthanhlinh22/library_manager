package com.example.library_manager.model;
import com.example.library_manager.database.DataBaseConnection;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookModel {
    private final Connection conn;

    public BookModel() {
        this.conn = DataBaseConnection.getConnection();
    }

    public ResultSet getAllBooks() throws SQLException {
        //chuẩn bị câu lệnh truy vấn
        String sql = "SELECT * FROM books";
        PreparedStatement preparedStatement = this.conn.prepareStatement(sql);
        //thực hien câu lệnh truy vấnn
        return preparedStatement.executeQuery();
    }

    public void destroyBook(int id) throws SQLException {
        String sql = "DELETE FROM books WHERE id = ?";
        PreparedStatement preparedStatement = this.conn.prepareStatement(sql);
        //set param
        preparedStatement.setInt(1, id);
        //thuc thi cau lenh truy vsn
        preparedStatement.execute();
    }
}


