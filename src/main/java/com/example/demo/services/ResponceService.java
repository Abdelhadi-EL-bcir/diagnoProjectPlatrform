package com.example.demo.services;

import com.example.demo.beans.Responce;

import java.util.List;

public interface ResponceService {
    public Responce create(Responce responce);
    public Responce update(Responce responce , Long id);
    public String delete(Long id);
    public Responce get(Long id);
    public List<Responce> getAll();
}
