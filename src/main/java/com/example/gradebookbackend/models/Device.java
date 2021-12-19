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
@Table(name = "device", schema = "public")
public class Device {

    @Id
    @Column(name = "code_type_of_device")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codeDevice;

    @Column(name = "number_of_order")
    private Integer orderNumb;

    @Column(name = "serial_number")
    private String serial;

    @Column(name = "vendor")
    private String vendor;

    @Column(name = "manufacture_date")
    private Date manufactureDate;

    @Column(name = "ram")
    private Integer ram;

    @Column(name = "com")
    private Boolean com;

    @Column(name = "cpu")
    private String cpu;

    @Column(name = "cd")
    private Boolean cd;

    @Column(name = "country")
    private String Country;

}
