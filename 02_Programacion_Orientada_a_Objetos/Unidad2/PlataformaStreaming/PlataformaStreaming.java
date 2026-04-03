import java.util.ArrayList;
import java.util.List;

public class PlataformaStreaming {
    private String nombre;
    // Agregación
    private List<Usuario> usuarios;

    public PlataformaStreaming(String nombre) {
        if (nombre == null)
            throw new IllegalArgumentException("Nombre es obligatorio");

        this.nombre = nombre;
        this.usuarios = new ArrayList<>();
    }

    public void registrarUsuario(Usuario u) {
        if (u == null)
            return;
        usuarios.add(u);

    }

    public int getTotalUsuarios() {
        return usuarios.size();
    }
}
