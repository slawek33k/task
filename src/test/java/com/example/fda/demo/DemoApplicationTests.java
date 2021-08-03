package com.example.fda.demo;

import com.example.fda.demo.api.rest.FDAController;
import com.example.fda.demo.api.rest.response.DrugDTO;
import com.example.fda.demo.client.OpenFDAClient;
import com.example.fda.demo.domain.Drug;
import com.example.fda.demo.service.FDAService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	OpenFDAClient openFDAClient;

	@Autowired
	FDAController controller;

	@Autowired
	FDAService fdaService;

	private String manufacturer = "Aytu Therapeutics";
	private String manufacturer2 = "Heritage Pharmaceuticals Inc.";

	@Test
	void contextLoads() {

	}

	@Test
	void test1() {
		ResponseEntity<DrugDTO> dto = controller.getAllDrugsByManufacturer(manufacturer);
		System.out.println("DTO: " + dto);
	}

	@Test
	void testRepository() {
		openFDAClient.getByManufacturerName(manufacturer);

		fdaService.addSomeData();
		fdaService.addSomeData();
		fdaService.addSomeData();
		List<Drug> result = fdaService.findAll();
		System.out.println("result entiteis = " + result);
	}

}
