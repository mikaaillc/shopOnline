package com.example.shoponline.Service.Abstract;

import com.example.shoponline.Entities.Category;
import com.example.shoponline.Entities.Product;

import java.util.List;

public interface ICategoryService {

    List<Category> getAllCategory();
    Boolean saveCategory(Category category);
}
