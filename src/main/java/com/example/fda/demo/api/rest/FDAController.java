package com.example.fda.demo.api.rest;

import com.example.fda.demo.api.rest.response.DrugDTO;
import com.example.fda.demo.client.OpenFDAClient;
import com.example.fda.demo.domain.Drug;
import com.example.fda.demo.service.FDAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FDAController {

    @Autowired
    FDAService fdaService;

    @Autowired
    OpenFDAClient openFDAClient;

    @GetMapping("/drug")
    public ResponseEntity<List<Drug>> getAllDrugs(@RequestParam(required = false) String manufacturer) {
        // TODO remove
        fdaService.addSomeData();
        fdaService.addSomeData();
        fdaService.addSomeData();

        List<Drug> drugs = fdaService.findAll();
        return new ResponseEntity<>(drugs, HttpStatus.OK);
    }

    @GetMapping("/drug/manufacturer/{manufacturer}")
    public ResponseEntity<DrugDTO> getAllDrugsByManufacturer(@RequestParam(required = false) String manufacturer) {

        DrugDTO result = openFDAClient.getByManufacturerName(manufacturer);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
