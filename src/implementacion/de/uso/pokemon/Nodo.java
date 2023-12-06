
package implementacion.de.uso.pokemon;

public class Nodo {
    Pokemon informacion;
    Nodo siguiente;

    public Nodo(Pokemon pokemon) {
        this.informacion = pokemon;
        this.siguiente = null;
    }
    
    

    public Pokemon getInformacion() {
        return informacion;
    }

    public void setInformacion(Pokemon informacion) {
        this.informacion = informacion;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    
    
    
    
    
}
