import java.util.ArrayList;
import java.util.List;

class Perfil {
    private String nombrePerfil;
    // Asociación
    private List<Contenido> favoritos;

    public Perfil(String nombrePerfil) {
        if (nombrePerfil == null) throw new IllegalArgumentException("El nombre de Usuario es obligatorio");

        this.nombrePerfil = nombrePerfil;

        this.favoritos = new ArrayList<>();
    }

    public void agregarAFavoritos(Contenido c) {
        // parametro
        if (c == null)
            return;
        favoritos.add(c);
    }

    public String mostrarFavoritos() {
        String resultado = "";
        for (Contenido c : favoritos) {
            resultado += c.getTitulo() + " || ";
        }
        return resultado;
    }

    public String getNombrePerfil() {
        return this.nombrePerfil;
    }

    public int getTotalFavoritos() {
        return favoritos.size();
    }

}
