
package implementacion.de.uso.pokemon;

import javax.swing.JOptionPane;


public class Cola {
    private Nodo inicioCola;
    private Nodo finalCola;
    String Cola = "";
    
    public Cola(){
        inicioCola = null;
        finalCola = null;
        
        
    }
    
    //Metodo para saber si la Cola esta vacia
    public boolean ColaVacia(){
        if (inicioCola == null) {
            return true;
            
        }else{
            return false;
        }
    }
    
    //Metodo para insertar a la Cola
    public void Insertar (Pokemon informacion){
        Nodo nuevoPokemon = new Nodo (informacion);
        
        
        if (ColaVacia()) {
            inicioCola = nuevoPokemon;
            finalCola = nuevoPokemon;
            
        }else{
            finalCola.siguiente = nuevoPokemon;
            finalCola = nuevoPokemon;
        }
    }
    
    public void MostrarContenido (){
        Nodo recorrido = inicioCola;
        String ColaInvertida = "";
        
        while (recorrido  != null) {
            Cola += recorrido.informacion + " ";
            recorrido = recorrido.siguiente;
        }
        String cadena [] = Cola.split(" ");
        
        for (int i = cadena.length - 1; i >=0; i--) {
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
