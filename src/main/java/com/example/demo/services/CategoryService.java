package com.example.demo.services;

import com.example.demo.beans.Category;

import java.util.List;

public interface CategoryService {
    public Category create(Category category);
    public Category update(Category category , Long id);
    public String delete(Long id);
    public Category get(Long id);
    public List<Category> getAll();
}
