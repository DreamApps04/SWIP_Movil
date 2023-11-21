package com.swip.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;


@Data
@Entity
@Table(name="credito")
public class Credito implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id //Id del credito
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Se generan valores relacionados a la DB
    @Column(name="id_credito")
    private long idcredito;
    private String nombreCred;
    private String mesRegistro;
    private double monto;
    private int numCuotas;
    @Column(name="cuotasRealizadas")
    private int cuotasRealizadas;
    private int userID;
    
    public Credito(){
    }

    public Credito(String nombreCred, String mesRegistro, double monto, int numCuotas, int cuotasRealizadas) {
        this.nombreCred = nombreCred;
        this.mesRegistro = mesRegistro;
        this.monto = monto;
        this.numCuotas = numCuotas;
        this.cuotasRealizadas = cuotasRealizadas;
    }

}
