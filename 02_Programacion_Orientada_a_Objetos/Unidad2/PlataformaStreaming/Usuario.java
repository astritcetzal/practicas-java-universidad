import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String correo;

    // Composición
    private List<Perfil> perfiles;

    public Usuario(String nombre, String correo, List<Perfil> perfiles) {
        if (nombre == null)
            throw new IllegalArgumentException("Nombre es obligatorio");
        if (correo == null)
            throw new IllegalArgumentException("Correo es obligatorio");
        if (perfiles == null || perfiles.isEmpty())
            throw new IllegalArgumentException("Correo es obligatorio");

        this.nombre = nombre;
        this.correo = correo;
        this.perfiles = new ArrayList<>(perfiles);
    }

    public void agregarPerfil(Perfil p) {
        if (p == null)
            return;
        perfiles.add(p);
    }

    public int getTotalPerfiles() {
        return perfiles.size();
    }

    public String getNombre() {
        return nombre;
    }

}
