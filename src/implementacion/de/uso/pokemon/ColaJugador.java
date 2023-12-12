package implementacion.de.uso.pokemon;

import javax.swing.JOptionPane;

public class ColaJugador {

    private Nodo inicioCola;
    private Nodo finalCola;
    String Cola = "";
    int size;

    public ColaJugador() {
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
    
    public void encolar(Pokemon pokemon) {
        // Verificar si el Pokemon ya está en la cola
        Nodo actual = inicioCola;
        while (actual != null) {
            if (actual.getInformacion().getNombre().equals(pokemon.getNombre())) {
                JOptionPane.showMessageDialog(null, "Pokemon ya se encuentra en la pokedex");
                return;
            }
            actual = actual.getSiguiente();
        }

        // Si el Pokemon no está en la cola, agregarlo
        Nodo nuevoNodo = new Nodo(pokemon);
        if (inicioCola == null) {
            inicioCola = nuevoNodo;
        } else {
            finalCola.setSiguiente(nuevoNodo);
        }
        finalCola = nuevoNodo;
        size++;
    }
    
    public Pokemon desencolar() {
    if (ColaVacia()) {
        JOptionPane.showMessageDialog(null, "Ya no tienes pokemones en tu pokedex");
        return null;
    } else {
        Pokemon pokemonDesencolado = inicioCola.getInformacion();
        inicioCola = inicioCola.getSiguiente();
        if (inicioCola == null) {
            finalCola = null;
        }
        size--;
        return pokemonDesencolado;
    }
}


    public void MostrarContenido() {
        Nodo recorrido = inicioCola;
        String ColaInvertida = "";

        while (recorrido != null) {
            Cola += recorrido.informacion + " ";
            recorrido = recorrido.siguiente;
        }
        String cadena[] = Cola.split(" ");

        for (int i = cadena.length - 1; i >= 0; i--) {
            ColaInvertida += cadena[i] + " ";

        }
        System.out.println(ColaInvertida);
        Cola = " ";

    }

    public int longitudCola() {
        Nodo recorrido = inicioCola;
        int longitud = 0;

        while (recorrido != null) {
            longitud++;
            recorrido = recorrido.siguiente;
        }

        return longitud;
    }

}
