package com.swip.service.impl;

import com.swip.dao.IngresoDao;
import com.swip.domain.Ingreso;
import com.swip.service.IngresoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class IngresoServiceImpl implements IngresoService {
    
    @Autowired
    private IngresoDao ingresoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Ingreso> getAllIngresos() {
        var lista = ingresoDao.findAll();
        return lista;
    }
    
  @Override
    @Transactional
    public void save(Ingreso ingreso) {
        ingresoDao.save(ingreso);
    }

        @Override
    @Transactional
    public void delete(Ingreso ingreso) {
        ingresoDao.delete(ingreso);
    }

 @Override
@Transactional(readOnly = true)
public Ingreso getIngreso(Ingreso ingreso) {
    return ingresoDao.findById(ingreso.getIdIngreso()).orElse(null);
}

  

}
