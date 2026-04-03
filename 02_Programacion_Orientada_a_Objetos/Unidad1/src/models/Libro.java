public class Libro {
    private String titulo;
    private boolean disponible ;
    public Libro(String titulo){
        this.titulo= titulo;
        disponible = true;
    }
    public void prestar(){
        disponible = false;
    }
    public String obtenerInfo(){
        return  "Libro: " + titulo + " " + " Disponible? " + disponible;
    }
}
