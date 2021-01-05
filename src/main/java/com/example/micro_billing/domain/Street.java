package com.example.micro_billing.domain;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Street {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @JsonView(View.StreetSimple.class)
    private long id;
    @JsonView(View.StreetSimple.class)
    private String name;

    @OneToMany(mappedBy = "street", fetch = FetchType.LAZY)
    private List<Client> clientList;
}
