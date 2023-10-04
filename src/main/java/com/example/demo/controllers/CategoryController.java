package com.example.demo.controllers;

import com.example.demo.beans.Category;
import com.example.demo.servicesImpl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/cat")
public class CategoryController {
    @Autowired
    private CategoryServiceImpl categoryServiceImpl;

    @PostMapping("/add")
    public Category create(@RequestBody Category category) {
        return categoryServiceImpl.create(category);
    }

    @PutMapping("/edit/{id}")
    public Category update(@RequestBody Category category,@PathVariable Long id) {
        return categoryServiceImpl.update(category, id);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return categoryServiceImpl.delete(id);
    }

    @GetMapping("/get/{id}")
    public Category get(@PathVariable Long id) {
        return categoryServiceImpl.get(id);
    }

    @GetMapping("/all")
    public List<Category> getAll() {
        return categoryServiceImpl.getAll();
    }
}
