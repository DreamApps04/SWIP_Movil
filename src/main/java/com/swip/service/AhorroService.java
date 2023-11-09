
package com.swip.service;

import com.swip.domain.Ahorro;
import java.util.List;


public interface AhorroService {
    public List<Ahorro> getAhorros();
    
    public Ahorro getAhorro(Ahorro Usuario);
    
    public void save(Ahorro Usuario);
    
    public void delete(Ahorro Usuario);
}
