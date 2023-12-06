
package implementacion.de.uso.pokemon;


public class Pokemon {
    private String Nombre;
    private String Tipo;
    private int Vida;
    private int Ataque;
    private int Defensa;
    private int ataqueEspecial;
    private int defensaEspecial;

    public Pokemon() {
    }

    public Pokemon(String Nombre,String Tipo, int Vida, int Ataque, int Defensa, int ataqueEspecial, int defensaEspecial) {
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Vida = Vida;
        this.Ataque = Ataque;
        this.Defensa = Defensa;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
   

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    

    public int getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }

    public int getAtaque() {
        return Ataque;
    }

    public void setAtaque(int Ataque) {
        this.Ataque = Ataque;
    }

    public int getDefensa() {
        return Defensa;
    }

    public void setDefensa(int Defensa) {
        this.Defensa = Defensa;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(int ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public int getDefensaEspecial() {
        return defensaEspecial;
    }

    public void setDefensaEspecial(int defensaEspecial) {
        this.defensaEspecial = defensaEspecial;
    }

    @Override
    public String toString() {
        return Nombre + " de tipo: "+ Tipo;
    }
    
    
    
    
}
