package com.example.micro_billing.controller;

import com.example.micro_billing.domain.Street;
import com.example.micro_billing.domain.View;
import com.example.micro_billing.service.StreetService;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/streets")
@CrossOrigin(origins = "*")
public class StreetController {
    private StreetService streetService;

    @Autowired
    public void setStreetService(StreetService streetService) {
        this.streetService = streetService;
    }

    @GetMapping
    @JsonView(View.StreetSimple.class)
    public ResponseEntity<List<Street>> getAllStreets() {
        return new ResponseEntity<>(streetService.getAllStreets(), HttpStatus.OK);
    }
}
