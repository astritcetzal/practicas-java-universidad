public class Flauta extends Instrumento implements darMantenimiento{
    public Flauta (String nombre){
        super(nombre);
    }
    public void Mantenimiento(){
        System.out.println("Dando mantenimiento al instrumento de viento "+  super.nombre);
    }
    
}
