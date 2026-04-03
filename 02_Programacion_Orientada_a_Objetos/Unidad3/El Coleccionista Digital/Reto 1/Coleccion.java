import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Coleccion {

    private List<Integer> juegos = new ArrayList<>();// falta el tipo

    public void agregar(int juego) {

        if (juegos == null) {
            throw new ArrayIndexOutOfBoundsException("No puede estar vacío, debe de haber al menos un juego");
        }
        juegos.add(juego);
    }

    public void mostrar() {
        for (int j : juegos) {
            System.out.println(juegos.get(j));
        }
    }

    public void eliminarRepetidos() {
        Iterator<Integer> it = juegos.iterator();

        while (it.hasNext()) {
            int primera = juegos.indexOf(it);
            int ultima = juegos.lastIndexOf(it);
            if (primera != ultima) {
                juegos.remove(ultima);
            }
        }

    }

}
