package com.example.encryptiondemo.model.entities;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "testers", schema = "dbo")
public class Testers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre_apellido")
    private String nombre_apellido;

    @Column(name = "num_tel")
    private String num_tel;

    @Column(name = "isBanking")
    private boolean isBanking;

    @Column(name = "isBCP")
    private boolean isBCP;

    @Column(name = "edad")
    private Integer edad;

}
