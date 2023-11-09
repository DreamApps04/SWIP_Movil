package com.swip.dao;

import com.swip.domain.Credito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditoDao extends JpaRepository<Credito, Long>{
    
}
