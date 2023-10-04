package com.example.demo.controllers;

import com.example.demo.beans.Responce;
import com.example.demo.servicesImpl.ResponceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/res")
public class ResponceController {

    @Autowired
    private ResponceServiceImpl responceServiceImpl;

    @PostMapping("/add")
    public Responce create(@RequestBody Responce responce) {
        return responceServiceImpl.create(responce);
    }

    @PutMapping("/edit/{id}")
    public Responce update(@RequestBody Responce responce,@PathVariable Long id) {
        return responceServiceImpl.update(responce, id);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return responceServiceImpl.delete(id);
    }

    @GetMapping("/get/{id}")
    public Responce get(@PathVariable  Long id) {
        return responceServiceImpl.get(id);
    }

    @GetMapping("/all")
    public List<Responce> getAll() {
        return responceServiceImpl.getAll();
    }
}
