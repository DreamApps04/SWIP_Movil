
package implementacion.de.uso.pokemon;


public class PokemonNormal {
    
    private int Vida;
    private int Ataque;
    private int Defensa;
    private int ataqueEspecial;
    private int defensaEspecial;

    public PokemonNormal(int Vida, int Ataque, int Defensa, int ataqueEspecial, int defensaEspecial) {
        this.Vida = 150;
        this.Ataque = 50;
        this.Defensa = 35;
        this.ataqueEspecial = 70;
        this.defensaEspecial = 60;
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
    
    
    
    
}
