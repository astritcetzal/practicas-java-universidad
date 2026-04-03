public class Violin extends Instrumento implements seAfina, darMantenimiento{
    public Violin(String nombre){
        super(nombre);
        super.tocar();
    }
    @Override
    public void afinar(){
        System.out.println("Afinando instrumento de cuerda "  + super.nombre);
    }
    @Override
    public void Mantenimiento(){
        System.out.println("Dando Mantenimiento al instrumento de cuerda " + super.nombre);
    }
}
