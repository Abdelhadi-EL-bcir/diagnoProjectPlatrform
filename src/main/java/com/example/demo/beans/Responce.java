package com.example.demo.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Responce {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int note;
    private Result result;
}

enum Result {
    Tout_A_Fait_Daccord ,
    Daccord ,
    Neutre ,
    Pas_daccord ,
    Desaccord_Total
}
