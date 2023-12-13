package com.swip.service;


import com.swip.domain.Presupuesto;
import java.util.List;


public interface PresupuestoService {
    
    public List<Presupuesto> getAllPresupuesto();
    
    public Presupuesto getPresupuesto(Presupuesto presupuesto);
    
    public void save(Presupuesto presupuesto);
    
    public void delete(Presupuesto presupuesto);
    
}
