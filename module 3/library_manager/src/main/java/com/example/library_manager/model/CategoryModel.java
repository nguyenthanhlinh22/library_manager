package com.example.library_manager.model;

import com.example.library_manager.database.DataBaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryModel {
    private final Connection conn;

    public CategoryModel() {
        this.conn = DataBaseConnection.getConnection();
    }
    public ResultSet getAllCategories() throws SQLException {
        String sql = "SELECT * FROM categories";
        PreparedStatement preparedStatement = this.conn.prepareStatement(sql);
        return preparedStatement.executeQuery();
    }
}
