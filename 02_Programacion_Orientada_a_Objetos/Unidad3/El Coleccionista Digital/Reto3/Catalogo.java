package Reto3;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Catalogo {// bimbimbambam
    private List<Pelicula> peliculas;

    public void agregar(Pelicula p) {
        if (p.getCalificacion() < 1 || p.getCalificacion() > 10) {
            throw new IllegalArgumentException("No puede ser mayor a 10 ni menor a 1");
        }
    }

    public void filtrarPorGenero(String genero){
        List<Pelicula> tipoGenero = new ArrayList<>();
        for (Pelicula p : peliculas) {
            if (p.getGenero().equals() ) {
                tipoGenero.add(p);
            }
        
    }

    
    public List<Peliculas> obtenerMejores(int minCalificacion) {
        List<Cancion> mejores= new ArrayList<>();
        for (Cancion c : canciones) {
            if (c.getCalificacion() < 1 || c.getCalificacion() > 10) {
                segundosCanciones.add(c);
            }
        }
        return segundosCanciones;
    }
    
}
}