
package com.swip.service;
 
import com.swip.domain.Ahorro;
import java.util.List;

public interface AhorroService {

    public List<Ahorro> getAllAhorros();
    
    public Ahorro getAhorro(Ahorro ahorro);
    
    public void save(Ahorro ahorro);
    
    public void delete(Ahorro ahorro);
      
}
