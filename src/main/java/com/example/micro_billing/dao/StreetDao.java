package com.example.micro_billing.dao;

import com.example.micro_billing.domain.Street;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StreetDao extends JpaRepository<Street, Long> {
}
