package com.example.gradebookbackend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "researcher", schema = "public")
public class Researcher {

    @Id
    @Column(name = "numb_of_researcher")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numResearcher;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "last_name")
    private String last_name;

}
