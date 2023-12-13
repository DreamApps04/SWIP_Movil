package com.swip.dao;

import com.swip.domain.Presupuesto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PresupuestoDao extends JpaRepository <Presupuesto, Long>{
    
}
