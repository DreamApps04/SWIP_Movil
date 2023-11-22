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
    private String nombre_Credito;
    private String mes_Registro;
    private double monto;
    private int num_Cuotas;
    private int cuotas_Realizadas;
    private int userID;
    
    public Credito(){
    }

    public Credito(String nombre_Credito, String mes_Registro, double monto, int num_Cuotas, int cuotas_Realizadas) {
        this.nombre_Credito = nombre_Credito;
        this.mes_Registro = mes_Registro;
        this.monto = monto;
        this.num_Cuotas = num_Cuotas;
        this.cuotas_Realizadas = cuotas_Realizadas;
    }

}
