package com.example.shoponline.Service.Concrete;

import com.example.shoponline.Entities.Category;
import com.example.shoponline.Repository.CategoryRepository;
import com.example.shoponline.Service.Abstract.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    private CategoryRepository  categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public Boolean saveCategory(Category category) {
        try {
            categoryRepository.save(category);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public List<Object> getCategoryData() {
        return categoryRepository.aMethodNameOrSomething();
    }
}
