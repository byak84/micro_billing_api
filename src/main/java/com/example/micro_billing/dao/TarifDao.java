package com.example.micro_billing.dao;

import com.example.micro_billing.domain.Tarif;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarifDao extends JpaRepository<Tarif, Long> {
}
