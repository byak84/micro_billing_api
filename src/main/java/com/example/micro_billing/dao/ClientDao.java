package com.example.micro_billing.dao;

import com.example.micro_billing.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDao extends JpaRepository<Client, Long> {
}
