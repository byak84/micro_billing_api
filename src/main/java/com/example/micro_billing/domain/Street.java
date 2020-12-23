package com.example.micro_billing.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Street {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;

    @OneToMany(mappedBy = "street", fetch = FetchType.EAGER)
    private List<Client> clientList;
}
