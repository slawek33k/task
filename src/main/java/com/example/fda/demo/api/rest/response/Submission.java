package com.example.fda.demo.api.rest.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Submission {

    private String application_number;
    private String sponsor_name;
}
