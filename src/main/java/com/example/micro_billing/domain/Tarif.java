package com.example.micro_billing.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Tarif {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String naming;
    private int price;

    @OneToMany(mappedBy = "tarif", fetch = FetchType.EAGER)
    private List<Client> clientList;

}
