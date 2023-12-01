/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.swip.dao;

import com.swip.domain.Presupuesto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author barah
 */
public interface PresupuestoDao extends JpaRepository <Presupuesto, Long>{
    
}
