package espacio;
import vehiculo.*;
public class Espacio {

    // Atributos
    private int numero;
    private String estado;
    private Vehiculo vehiculoActual;
    

    public Espacio(int numero){
        if (numero <= 0 ) throw new IllegalArgumentException("Ingrese un numero mayor y diferente a 0");
        this.numero = numero;
        this.estado = "Libre" ;
        this.vehiculoActual = null;//
    }

    // Métodos
    public void ocupar(Vehiculo vehiculo){
        vehiculoActual = vehiculo;
        estado = "Ocupado";
       
    }

    public void liberar(){
        vehiculoActual = null;
        estado = "Libre";


    }

    public boolean estaLibre(){
        return "Libre".equalsIgnoreCase(estado);
    }
    public int getNumero(){  //
        return numero;
    }
    

}