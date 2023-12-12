package implementacion.de.uso.pokemon;

import javax.swing.JOptionPane;

public class ColaGanador {

    private NodoGanador inicioCola;
    private NodoGanador finalCola;
    String Cola = "";
    int size;

    public ColaGanador() {
        inicioCola = null;
        finalCola = null;
        size = 0;
    }

    //Metodo para saber si la ColaJugador esta vacia
    public boolean ColaVacia() {
        if (inicioCola == null) {
            return true;

        } else {
            return false;
        }
    }

    public void encolar(Ganador ganador) {
        // Verificar si el Pokemon ya está en la cola
        NodoGanador actual = inicioCola;

        NodoGanador nuevoNodo = new NodoGanador(ganador);
        if (inicioCola == null) {
            inicioCola = nuevoNodo;
        } else {
            finalCola.setNext(nuevoNodo);
        }
        finalCola = nuevoNodo;
        size++;
    }

    public Ganador desencolar() {
        if (ColaVacia()) {
            JOptionPane.showMessageDialog(null, "No hay ganadores inscritos ");
            return null;
        } else {
            Ganador ganadorDesencolado = inicioCola.getDato();
            inicioCola = inicioCola.getNext();
            if (inicioCola == null) {
                finalCola = null;
            }
            size--;
            return ganadorDesencolado;
        }
    }

    public void MostrarContenido() {
        NodoGanador recorrido = inicioCola;
        String Cola = "";

        while (recorrido != null) {
            Cola += recorrido.dato.toString() + " ";
            recorrido = recorrido.next;
        }

        System.out.println(Cola);
        Cola = " ";
    }

    public int longitudCola() {
        NodoGanador recorrido = inicioCola;
        int longitud = 0;

        while (recorrido != null) {
            longitud++;
            recorrido = recorrido.next;
        }

        return longitud;
    }

}
