
package implementacion.de.uso.pokemon;


public class Ganador {
   private int id;
   private String nombreGan;

    public Ganador() {
    }

    public Ganador(int id, String nombreGan) {
        this.id = id;
        this.nombreGan = nombreGan;
    }
   
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreGan() {
        return nombreGan;
    }

    public void setNombreGan(String nombreGan) {
        this.nombreGan = nombreGan;
    }

    @Override
    public String toString() {
        return "Ganador: " + nombreGan ;
    }
   
   
    
}
