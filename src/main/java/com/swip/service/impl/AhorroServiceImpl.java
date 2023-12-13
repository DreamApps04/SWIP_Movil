package com.swip.service.impl;

import com.swip.dao.ahorroDao;
import com.swip.domain.Ahorro;
import com.swip.service.AhorroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AhorroServiceImpl implements AhorroService {

    @Autowired
    private ahorroDao ahorroDao;

    @Override
    @Transactional(readOnly = true)
    public List<Ahorro> getAllAhorros() {
        var lista = ahorroDao.findAll();
        return lista;
    }

    @Override
    @Transactional
    public void save(Ahorro ahorro) {
        ahorroDao.save(ahorro);
    }

    @Override
    @Transactional
    public void delete(Ahorro ahorro) {
        ahorroDao.delete(ahorro);
    }

    @Override
    @Transactional(readOnly = true)
    public Ahorro getAhorro(Ahorro ahorro) {
        return ahorroDao.findById(ahorro.getIdAhorro()).orElse(null);
    }
}
