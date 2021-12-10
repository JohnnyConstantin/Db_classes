package com.example.gradebookbackend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sell", schema = "public")
public class Sell {

    @Id
    @Column(name = "number_of_order")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numOrder;

    @Column(name = "Client")
    private String client;

    @Column(name = "date_of_order")
    private Date dateOrder;

    @Column(name = "summary")
    private Integer summ;

    @Column(name = "deadline")
    private Date deadline;

}
