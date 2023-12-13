package com.swip.dao;

import com.swip.domain.Ahorro;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ahorroDao extends JpaRepository<Ahorro, Long> {
    
}
