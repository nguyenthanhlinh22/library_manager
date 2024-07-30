package com.example.library_manager.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private  static  final  String DATABASE_URL = "jdbc:mysql://localhost:3306/library?useSSL=false";
    private  static  final  String USERNAME = "root";
    private  static  final  String PASSWORD = "thanhlinh22";


    public DataBaseConnection() {

    }

    public static Connection getConnection()  {
        //dung try catch bat ngoai le
        Connection conn = null;//chua thuc hien ket noi
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            System.out.println("Connect database successfully");
        }catch (SQLException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        return conn;

    }
}
