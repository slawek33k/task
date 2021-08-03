package com.example.fda.demo.client;

import com.example.fda.demo.api.rest.response.DrugDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Service
public class OpenFDAClient {

    @Autowired
    RestTemplate restTemplate;

    @Value("${api.key}")
    String apiKey;

    @Value("${api.fda.base-path}")
    private String basePath;

    @Value("${api.fda.manufacturer-query}")
    String manufacturerQuery;

    public DrugDTO getByManufacturerName(String manufacturer) {
        String path = null;
        try {
            path = basePath + "?api_key=" + apiKey + "&" + manufacturerQuery + URLEncoder.encode(manufacturer, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println("Path : " + path);

        DrugDTO result = restTemplate.getForObject(path, DrugDTO.class);
        System.out.println(result);
        return result;
    }

    public void getByManufacturerAndBrandName(String manufacturer, String brand) {

    }
}
