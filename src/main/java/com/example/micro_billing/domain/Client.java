package com.example.micro_billing.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnoreProperties(value = "clientList")
    private Street street;
    private String house_number;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnoreProperties(value = "clientList")
    private Tarif tarif;
    private String ip;

    private boolean deleted;
    private boolean active;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date connection_date;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date disconnection_date;
    private int score;

    @ManyToMany(fetch = FetchType.EAGER)
    @JsonIgnoreProperties(value = "clientsList")
    @JoinTable(name = "clients_payments",
            joinColumns = @JoinColumn(name = "client_id"),
            inverseJoinColumns = @JoinColumn(name = "payment_id"))
    private List<Payment> paymentList;

    private String login;
    private String password;

}
