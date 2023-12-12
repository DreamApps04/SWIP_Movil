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
@Table(name = "ingreso")
public class Ingreso implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ingreso")
    private long idIngreso;
    private String nombre_ingreso;
    private String icono;
    private String descripingreso;
    private double monto;

    public Ingreso() {
    }

     public Ingreso(String nombre_ingreso, String icono, double monto, String descripingreso) {
        this.nombre_ingreso = nombre_ingreso;
        this.icono = icono;
        this.monto = monto;
        this.descripingreso = descripingreso;
    }
    
}


