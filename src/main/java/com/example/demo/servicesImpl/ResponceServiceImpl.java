package com.example.demo.servicesImpl;

import com.example.demo.beans.Responce;
import com.example.demo.repositories.ResponceRepository;
import com.example.demo.services.ResponceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponceServiceImpl implements ResponceService {

    @Autowired
    private ResponceRepository responceRepository;

    @Override
    public Responce create(Responce responce) {
        return responceRepository.save(responce);
    }

    @Override
    public Responce update(Responce responce, Long id) {
        return null;
    }

    @Override
    public String delete(Long id) {
        responceRepository.deleteById(id);
        return "Responce has deleted successfully";
    }

    @Override
    public Responce get(Long id) {
        return responceRepository.findResponceById(id);
    }

    @Override
    public List<Responce> getAll() {
        return responceRepository.findAll();
    }
}
