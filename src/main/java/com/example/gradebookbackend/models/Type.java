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
@Table(name = "type_of_device", schema = "public")
public class Type {

    @Id
    @Column(name = "code_type_of_device")
    private Integer codeDevice;

    @Column(name = "name_of_device")
    private String deviceName;



}
