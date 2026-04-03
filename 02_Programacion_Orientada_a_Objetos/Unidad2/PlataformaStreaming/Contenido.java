public class Contenido {
    private String titulo;
    private String genero;

    public Contenido(String titulo, String genero) {
        if (titulo == null)
            throw new IllegalArgumentException("Titulo es obligatorio");
        if (genero == null)
            throw new IllegalArgumentException("Genero es obligatorio");
        this.titulo = titulo;
        this.genero = genero;
    }

    public String mostrarInfo() {
        if (titulo == null)
            return "";
        return "Nombre: " + this.titulo+ " " + "Género: " + this.genero;
    }

    public String getTitulo() {
        return titulo;
    }
}
