package com.example.micro_billing.controller;

import com.example.micro_billing.domain.Tarif;
import com.example.micro_billing.domain.View;
import com.example.micro_billing.service.TarifService;
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
@RequestMapping("/tarifs")
@CrossOrigin(origins = "*")
public class TarifController {
    private TarifService tarifService;

    @Autowired
    public void setTarifService(TarifService tarifService) {
        this.tarifService = tarifService;
    }

    @GetMapping
    @JsonView(View.TarifSimple.class)
    public ResponseEntity<List<Tarif>> getAllTarifs() {
        return new ResponseEntity<>(tarifService.getAllTarifs(), HttpStatus.OK);
    }
}
