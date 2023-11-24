package com.swip.service.impl;

import com.swip.dao.CreditoDao;
import com.swip.domain.Credito;
import com.swip.service.CreditoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class CreditoServiceImpl implements CreditoService{

    @Autowired
    private CreditoDao creditoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Credito> getAllCreditos() {
        var lista = creditoDao.findAll();
        return lista;
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<Credito> getCreditos(long idcredito) {
        var lista = creditoDao.findAll();
        if (idcredito == 1) {
            //lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Credito getCredito(Credito credito) {
        return creditoDao.findById(credito.getIdcredito()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Credito credito) {
        creditoDao.save(credito);
    }

    @Override
    @Transactional
    public void delete(Credito credito) {
        creditoDao.delete(credito);
    }
}
