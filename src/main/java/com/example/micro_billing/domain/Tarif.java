package com.example.micro_billing.domain;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Tarif {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @JsonView(View.TarifSimple.class)
    private long id;

    @JsonView(View.TarifSimple.class)
    private String naming;
    @JsonView(View.TarifSimple.class)
    private int price;

    @OneToMany(mappedBy = "tarif", fetch = FetchType.LAZY)
    private List<Client> clientList;

}
