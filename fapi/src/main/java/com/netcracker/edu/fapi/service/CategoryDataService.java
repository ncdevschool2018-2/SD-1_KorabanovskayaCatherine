package com.netcracker.edu.fapi.service;

import com.netcracker.edu.fapi.models.CategoryViewModel;

import java.util.List;

public interface CategoryDataService {

    List<CategoryViewModel> getAllCategories();

    CategoryViewModel getCategory(Integer id);

    CategoryViewModel saveCategory(CategoryViewModel category);

    void deleteCategory(Integer id);
}
