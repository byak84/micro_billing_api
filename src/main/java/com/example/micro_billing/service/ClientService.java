package com.example.micro_billing.service;

import com.example.micro_billing.dao.ClientDao;
import com.example.micro_billing.domain.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final ClientDao clientDao;
    @Autowired
    public ClientService(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    public List<Client> getAllClients() {
        return clientDao.findAll();
    }
}
