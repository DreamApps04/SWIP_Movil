/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.swip.service;


import com.swip.domain.Presupuesto;
import java.util.List;

/**
 *
 * @author barah
 */
public interface PresupuestoService {
    
    public List<Presupuesto> getAllPresupuesto();
    
    public Presupuesto getPresupuesto(Presupuesto presupuesto);
    
    public void save(Presupuesto presupuesto);
    
    public void delete(Presupuesto presupuesto);
    
}
