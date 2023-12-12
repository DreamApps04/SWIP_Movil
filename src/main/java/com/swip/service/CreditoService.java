package com.swip.service;

import com.swip.domain.Credito;
import java.util.List;


public interface CreditoService {
    //Obtener todos los ingresos
    public List<Credito> getAllCreditos();
    
    // Se obtiene un listado de productos en un List
    public List<Credito> getCreditos(long idcredito);
    
   // Se obtiene un Credito, a partir del id de un producto
    public Credito getCredito(Credito credito);
    
    // Se inserta un nuevo producto si el id del producto esta vacío
    // Se actualiza un producto si el id del producto NO esta vacío
    public void save(Credito credito);
    
    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete(Credito credito);
}
