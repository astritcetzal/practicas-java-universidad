public class Instrumento {
    protected String nombre;
    public Instrumento (String nombre){
        this.nombre = nombre;
    }
    public void tocar(){
        System.out.println("Tocando instrumento " + nombre);
    }
}
