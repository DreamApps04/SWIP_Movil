
package com.swip.service;
 
import com.swip.domain.Ingreso;
import java.util.List;

public interface IngresoService {

    public List<Ingreso> getAllIngresos();
    
    public Ingreso getIngreso(Ingreso ingreso);
    
    public void save(Ingreso ingreso);
    
    public void delete(Ingreso ingreso);
      
}
