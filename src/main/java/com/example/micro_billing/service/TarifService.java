package com.example.micro_billing.service;

import com.example.micro_billing.dao.TarifDao;
import com.example.micro_billing.domain.Tarif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarifService {
    private TarifDao tarifDao;

    @Autowired
    public void setTarifDao(TarifDao tarifDao) {
        this.tarifDao = tarifDao;
    }

    public List<Tarif> getAllTarifs() {
        return tarifDao.findAll();
    }
}
