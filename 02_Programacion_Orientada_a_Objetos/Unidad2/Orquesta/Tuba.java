//implementar interfaces 
public class Tuba extends Instrumento implements darMantenimiento, seAfina {
    // constructor
    public Tuba (String nombre){
        super(nombre);
        super.tocar();
    }
    @Override
    public void Mantenimiento(){
        System.out.println("Dando Mantenimiento al instrumento de vientos ");
    }
    @Override
    public void afinar(){
        System.out.println("Se afinó el instrumento de viento "  + super.nombre);
    }

}
