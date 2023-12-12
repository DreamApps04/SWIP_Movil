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
@Table(name = "ahorro")
public class Ahorro implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ahorro")
    private long idAhorro;
    private String nombre_ahorro;
    private String icono;
    private String descripahorro;
    private double monto;

    public Ahorro() {
    }

     public Ahorro(String nombre_ahorro, String icono, double monto, String descripahorro) {
        this.nombre_ahorro = nombre_ahorro;
        this.icono = icono;
        this.monto = monto;
        this.descripahorro = descripahorro;
    }
    
}

