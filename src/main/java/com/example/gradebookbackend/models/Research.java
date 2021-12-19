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
@Table(name = "research", schema = "public")
public class Research {

    @Id
    @Column(name = "code_of_work")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codeWork;

    @Column(name = "numb_of_researcher")
    private Integer numbResearcher;

    @Column(name = "date_of_research")
    private Date dateResearch;

    @Column(name = "number_of_days")
    private Integer numbDays;

    @Column(name = "serial_number")
    private String numbSerial;

}
