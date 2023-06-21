package com.softuni.bookshop.services.category;

import com.softuni.bookshop.domain.entities.Category;

import java.util.List;

public interface CategoryService {
    void seedCategories(List<Category> categories);
}
