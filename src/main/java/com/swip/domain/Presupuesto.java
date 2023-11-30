/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
@Table(name = "presupuesto")
public class Presupuesto implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_gasto")
    private long id_gasto;
    private String nombreGasto;
    private String descripcion;
    private double monto;
    private String mesIngreso;
    private int numQuincena;
    private int userId;

    public Presupuesto() {
    }

    public Presupuesto(long id_gasto, String nombreGasto, String descripcion, double monto, String mesIngreso, int numQuincena, int userId) {
        this.id_gasto = id_gasto;
        this.nombreGasto = nombreGasto;
        this.descripcion = descripcion;
        this.monto = monto;
        this.mesIngreso = mesIngreso;
        this.numQuincena = numQuincena;
        this.userId = userId;
    }
    
    

    
    
    
    
    
}
