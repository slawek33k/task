package com.example.fda.demo.mapper;

import com.example.fda.demo.db.DrugEntity;
import com.example.fda.demo.domain.Drug;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DrugMapper {

    @Autowired
    private MapperFacade mapper;

    public Drug mapToDomain(DrugEntity drugEntity) {
        // TODO use orika mapper
        return Drug.builder()
                .applicationNumber(drugEntity.getApplicationNumber())
                .manufacturerNames(Arrays.asList(drugEntity.getManufacturerName()))
                .productNumbers(Arrays.asList(drugEntity.getProductNumbers()))
                .substanceNames(Arrays.asList(drugEntity.getSubstanceName()))
                .build();
    }
}
