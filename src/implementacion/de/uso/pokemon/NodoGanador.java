package implementacion.de.uso.pokemon;

public class NodoGanador {
     Ganador dato;
     NodoGanador next;

    public Ganador getDato() {
        return dato;
    }

    public void setDato(Ganador dato) {
        this.dato = dato;
    }

    public NodoGanador getNext() {
        return next;
    }

    public void setNext(NodoGanador next) {
        this.next = next;
    }

    public NodoGanador(Ganador dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "NodoGanador{" + "Ganador: " + dato;
    }

    

    
    
    
    
}
