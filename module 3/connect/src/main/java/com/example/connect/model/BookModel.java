package com.example.connect.model;

import com.example.connect.database.DataBaseConnect;

import java.sql.Connection;
import java.sql.SQLException;

public class BookModel {
    private Connection conn ;

    public BookModel() throws SQLException, ClassNotFoundException {
        this.conn = DataBaseConnect.getConnection();
    }
}
