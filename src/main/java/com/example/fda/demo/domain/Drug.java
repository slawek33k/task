package com.example.fda.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Drug {

    private String applicationNumber;
    private List<String> manufacturerNames;
    private List<String> substanceNames;
    private List<String> productNumbers;

}
