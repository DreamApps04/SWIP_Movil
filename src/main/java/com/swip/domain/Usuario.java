package com.swip.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name="usuario")
public class Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id //Id del usuario
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Se generan valores relacionados a la DB
    @Column(name="id_usuario")
    private long idusuario;
    private String email;
    private String nombre;
    private Date fecha_Ingreso;
    private String numero_Celular;
    private String contrasena;
    private boolean activo;
    
    @OneToMany
    @JoinColumn(name="id_usuario", updatable = false)
    List<Credito> creditos;
    
    public Usuario(){
    }
    
    public Usuario(String nombre, boolean activo) {
        this.nombre = nombre;
        this.activo = activo;
    }
}
