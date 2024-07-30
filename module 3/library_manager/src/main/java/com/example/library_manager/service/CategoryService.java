
package com.example.library_manager.service;

import com.example.library_manager.entity.Category;
import com.example.library_manager.model.CategoryModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryService {
    private final CategoryModel categoryModel;
    public CategoryService() {
        this.categoryModel = new CategoryModel();
    }

    public List<Category> getAllCategory() throws SQLException {
        List<Category> categories = new ArrayList<>();
        ResultSet resultSet = this.categoryModel.getAllCategories();
        //xu li thong tin duoc tra le
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");

            Category category = new Category(name);
            category.setId(id);
            categories.add(category);
        }
        return categories;

    }
}
