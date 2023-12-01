/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.swip.service.impl;

import com.swip.dao.PresupuestoDao;
import com.swip.domain.Presupuesto;
import com.swip.service.PresupuestoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author barah
 */
@Service
public class PresupuestoServiceImpl implements PresupuestoService{
    
    @Autowired
    private PresupuestoDao presupuestoDao;

    @Override
    @Transactional (readOnly = true)
    public List<Presupuesto> getAllPresupuesto() {
        var lista = presupuestoDao.findAll();
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Presupuesto getPresupuesto(Presupuesto presupuesto) {
        return presupuestoDao.findById(presupuesto.getId_gasto()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Presupuesto presupuesto) {
        presupuestoDao.save(presupuesto);
        
    }

    @Override
    @Transactional
    public void delete(Presupuesto presupuesto) {
        presupuestoDao.delete(presupuesto);
        
    }

    

   
    
}
