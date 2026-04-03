package Reto3;

public class Main {

    public static void main(String[] args) {

        Catalogo catalogo1 = new Catalogo();

        Pelicula p1 = new Pelicula("hola", "drama", 5);
        Pelicula p2 = new Pelicula("hola", "drama", 5);
        Pelicula p3 = new Pelicula("hola", "drama", 5);
        Pelicula p4 = new Pelicula("hola", "drama", 5);
        Pelicula p5 = new Pelicula("hola", "drama", -5);
        catalogo1.agregar(p1);
        catalogo1.agregar(p2);
        catalogo1.agregar(p3);
        catalogo1.agregar(p4);
        catalogo1.agregar(p5);

    }
}