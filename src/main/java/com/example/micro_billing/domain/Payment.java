package com.example.micro_billing.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String naming;
    private Date date;

    @ManyToMany
    @JoinTable(name = "clients_payments",
            joinColumns = @JoinColumn(name = "payment_id"),
            inverseJoinColumns = @JoinColumn(name = "client_id"))
    private List<Client> clientList;

}
