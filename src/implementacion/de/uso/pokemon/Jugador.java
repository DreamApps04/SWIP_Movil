
package implementacion.de.uso.pokemon;


public class Jugador {
    private Long id;
    private String Nombre;
    private String Apellido;
    private String Usuario;
    private String fechaNac;

    public Jugador(Long id, String Nombre, String Apellido, String Usuario, String fechaNac) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Usuario = Usuario;
        this.fechaNac = fechaNac;
    }

    public Jugador() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
    

    

   
    
   
    
    
    
}
