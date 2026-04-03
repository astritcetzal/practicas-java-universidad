public class Biblioteca{
    private static int totalPrestamos=0;
    public Biblioteca(){
    }
    public void registrarPrestamo(Libro libro, Usuarios usuarios ){
        libro.prestar();
        totalPrestamos++;
        usuarios.getNombre();
    }
    public static int getTotalPrestamos(){
        return totalPrestamos;
    }
}