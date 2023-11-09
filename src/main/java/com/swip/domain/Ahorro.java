
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
@Table(name="ahorros")
public class Ahorro implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_ahorro")
    
    private long idUsuario;
    private String nombreAhorro;
    private String descripcion;
    private double monto;
    private String icono;
    private long userId;

    public Ahorro() {
    }

    public Ahorro(long idUsuario, String nombreAhorro, String descripcion, double monto, String icono, long userId) {
        this.idUsuario = idUsuario;
        this.nombreAhorro = nombreAhorro;
        this.descripcion = descripcion;
        this.monto = monto;
        this.icono = icono;
        this.userId = userId;
    }
    
    
}
