package com.exemplo.doisApis.api2.controller;

import com.exemplo.doisApis.api1.Fip;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/consumer")
public class ApiFipConsumerController {

    private final RestTemplate restTemplate;

    @Value("${api.fip.url:http://localhost:8080/api/fip}")
    private String apiUrl;

    public ApiFipConsumerController() {
        this.restTemplate = new RestTemplate();
    }

    @GetMapping
    public List<Fip> consumirFips() {
        ResponseEntity<Fip[]> response = restTemplate.getForEntity(apiUrl, Fip[].class);
        return Arrays.asList(response.getBody());
    }
}
