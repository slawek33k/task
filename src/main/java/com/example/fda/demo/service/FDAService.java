package com.example.fda.demo.service;

import com.example.fda.demo.db.DrugEntity;
import com.example.fda.demo.db.DrugRepository;
import com.example.fda.demo.domain.Drug;
import com.example.fda.demo.mapper.DrugMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FDAService {

    @Autowired
    private DrugRepository drugRepository;

    @Autowired
    private DrugMapper drugMapper;

    public List<Drug> findAll() {
        return drugRepository.findAll().stream().map(drugMapper::mapToDomain).collect(Collectors.toList());
    }

    public void addSomeData() {
        drugRepository.save(new DrugEntity("a", "b", "c", "d"));
    }
}
