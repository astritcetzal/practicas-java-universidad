package Reto3;

public class Pelicula {

    private String titulo, genero;
    private int calificacion;

    public Pelicula(String titulo, String genero, int calificacion) {
        this.titulo = titulo;
        this.genero = genero;
        this.calificacion = calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getCalificacion() {
        return calificacion;
    }

}