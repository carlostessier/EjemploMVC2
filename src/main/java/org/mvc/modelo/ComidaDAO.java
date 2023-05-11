package org.mvc.modelo;

import java.util.List;

public interface ComidaDAO {
    
    public void guardar(Comida comida);
    
    public void borrar(Comida comida);
    
    public void buscar(Comida comida);
    
    public void modificar(Comida comida);
    
    public List<Comida> listar();
}
