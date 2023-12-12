package implementacion.de.uso.pokemon;

import javax.swing.JOptionPane;

public class ColaCPU {

    Nodo inicioCola;
    Nodo finalCola;
    int size;
    int contador;

    public ColaCPU() {
        this.inicioCola = null;
        this.finalCola = null;
        this.size = 0;
        this.contador = 0;
    }

    public void encolar(Pokemon pokemon) {
        Nodo nuevoNodo = new Nodo(pokemon);
        if (inicioCola == null) {
            inicioCola = nuevoNodo;
        } else {
            finalCola.siguiente = nuevoNodo;
        }
        finalCola = nuevoNodo;
        size++;
    }

    public boolean ColaVacia() {
        if (inicioCola == null) {
            return true;

        } else {
            return false;
        }
    }

    public Pokemon desencolar() {
        if (inicioCola == null) {
            JOptionPane.showMessageDialog(null, "El rival no tiene pokemones");
            return null;
        } else {
            Pokemon pokemonDesencolado = inicioCola.informacion;
            inicioCola = inicioCola.siguiente;
            if (inicioCola == null) {
                finalCola = null;
            }
            size--;
            return pokemonDesencolado;
        }
    }

    public Pokemon seleccionarAleatorio() {
        if (contador < 5) {
            int index = (int) (Math.random() * size);
            Nodo actual = inicioCola;
            Nodo anterior = null;
            for (int i = 0; i < index; i++) {
                anterior = actual;
                actual = actual.siguiente;
            }
            if (anterior != null) {
                anterior.siguiente = actual.siguiente;
            } else {
                inicioCola = actual.siguiente;
            }
            if (actual == finalCola) {
                finalCola = anterior;
            }
            size--;
            contador++;
            return actual.informacion;
        } else {
            return null;
        }
    }


    public void MostrarContenido() {
        Nodo recorrido = inicioCola;
        String Cola = "";
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
    }

    @Override
    public String toString() {
        String nombresPokemones = "";
        Nodo recorrido = inicioCola;

        while (recorrido != null) {
            nombresPokemones += recorrido.informacion.getNombre() + " ";
            recorrido = recorrido.siguiente;
        }

        return nombresPokemones;
    }

}
