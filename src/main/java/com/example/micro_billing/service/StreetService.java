package com.example.micro_billing.service;

import com.example.micro_billing.dao.StreetDao;
import com.example.micro_billing.domain.Client;
import com.example.micro_billing.domain.Street;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreetService {
    private StreetDao streetDao;
    @Autowired
    public void setStreetDao(StreetDao streetDao) {
        this.streetDao = streetDao;
    }

    public List<Street> getAllStreets() {
        return streetDao.findAll();
    }

}
