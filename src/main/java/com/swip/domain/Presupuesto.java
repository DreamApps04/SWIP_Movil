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
    private String nombre_Gasto;
    private String descripcion;
    private double monto;
    private String mes_Ingreso;
    private int num_Quincena;

    public Presupuesto() {
    }

    public Presupuesto(long id_gasto, String nombre_Gasto, String descripcion, double monto, String mes_Ingreso, int num_Quincena) {
        this.id_gasto = id_gasto;
        this.nombre_Gasto = nombre_Gasto;
        this.descripcion = descripcion;
        this.monto = monto;
        this.mes_Ingreso = mes_Ingreso;
        this.num_Quincena = num_Quincena;
    }
    
    

    
    
    
    
    
}
