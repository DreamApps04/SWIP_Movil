
package com.swip.service.impl;

import com.swip.dao.ahorroDao;
import com.swip.domain.Ahorro;
import com.swip.service.AhorroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


public class AhorroServiceImpl implements AhorroService{
    
    @Autowired
    private ahorroDao ahorroDao;

    @Override
    public List<Ahorro> getAhorros() {
        var lista = ahorroDao.findAll();
        return lista;
    }

    @Override
    public Ahorro getAhorro(Ahorro ahorro) {
        return ahorroDao.findById(ahorro.getIdUsuario()).orElse(null);
        
    }

    @Override
    public void save(Ahorro ahorro) {
        ahorroDao.save(ahorro);
        
    }

    @Override
    public void delete(Ahorro ahorro) {
        ahorroDao.delete(ahorro);
        
    }
    
}
