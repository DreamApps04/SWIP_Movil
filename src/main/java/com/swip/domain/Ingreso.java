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
@Table(name = "ingreso")
public class Ingreso implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ingreso")
    private long idIngreso;
    @Column(name = "nombreingreso") // Cambio de nombre de la columna
    private String nombreIngreso; // Cambio de nombre de la propiedad
    @Column(name = "descripingreso") // Cambio de nombre de la columna
    private String descripcionIngreso; // Cambio de nombre de la propiedad
    private double monto; // Asegúrate de usar double en lugar de long para monto

    public Ingreso() {
    }

    public Ingreso(String nombreIngreso, String descripcionIngreso, double monto) {
        this.nombreIngreso = nombreIngreso;
        this.descripcionIngreso = descripcionIngreso;
        this.monto = monto;
    }
}


