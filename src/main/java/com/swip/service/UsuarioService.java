package com.swip.service;

import com.swip.domain.Usuario;
import java.util.List;

public interface UsuarioService {
    // Se obtiene un listado de productos en un List
    public List<Usuario> getUsuarios(boolean activos);
    
   // Se obtiene un Usuario, a partir del id de un producto
    public Usuario getUsuario(Usuario producto);
    
    // Se inserta un nuevo producto si el id del producto esta vacío
    // Se actualiza un producto si el id del producto NO esta vacío
    public void save(Usuario producto);
    
    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete(Usuario producto);
}
