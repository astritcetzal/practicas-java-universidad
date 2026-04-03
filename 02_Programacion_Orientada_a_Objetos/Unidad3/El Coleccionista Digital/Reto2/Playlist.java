package Reto2;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Playlist {
    private List<Cancion> canciones;

    public Playlist() {
        this.canciones = new ArrayList<>();
    }

    public Cancion buscarPorArtista(String artista) {
        if (artista == null) {
            return null;
        }

        for (Cancion cancion : canciones) {
            if (cancion.getArtista().equals(artista)) {
                return cancion;
            }
        }
        return null;
    }

    public List<Cancion> filtrarLargas(int segundos) {
        List<Cancion> segundosCanciones = new ArrayList<>();
        for (Cancion c : canciones) {
            if (c.getDuracionSegundos() > segundos) {
                segundosCanciones.add(c);
            }
        }
        return segundosCanciones;
    }

    public void eliminarPorArtista(String artista) {
        Iterator<Cancion> ci = canciones.iterator();

        if (artista == null) {
            return;
        }
        while (ci.hasNext()) {
            Cancion c = ci.next();
            if (c.getArtista().equals(artista)) {
                ci.remove();

            }

        }

    }
}