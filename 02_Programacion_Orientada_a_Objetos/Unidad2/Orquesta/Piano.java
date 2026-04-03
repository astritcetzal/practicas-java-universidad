public class Piano extends Instrumento implements seAfina{
     public Piano (String nombre){
        super(nombre);
        super.tocar();
     }
     @Override
     public void afinar(){
        System.out.println("Afinando instrumento "  + super.nombre );
     }
     
}
