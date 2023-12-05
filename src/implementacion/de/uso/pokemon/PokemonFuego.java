
package implementacion.de.uso.pokemon;


public class PokemonFuego {
    
    private int Vida;
    private int Ataque;
    private int Defensa;
    private int ataqueEspecial;
    private int defensaEspecial;

    public PokemonFuego(int Vida, int Ataque, int Defensa, int ataqueEspecial, int defensaEspecial) {
        this.Vida = 115;
        this.Ataque = 70;
        this.Defensa = 45;
        this.ataqueEspecial = 80;
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
