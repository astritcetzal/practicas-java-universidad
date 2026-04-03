package vehiculo;
public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String placa, String horaEntrada, int cilindrada){
        super(placa, horaEntrada);
        if (cilindrada <=0) throw new IllegalArgumentException("Ingrese un numero mayor y diferente a 0");
        this.cilindrada=cilindrada;
    }

    @Override
    public double calcularTarifa(int horas) {
        double total = horas * 15.00;
        return total;
    }
    

    @Override
    public String obtenerResumen(){
        
        return "El vehiculo con placas: " +placa +"\n"+" Cilindraje: "+ cilindrada  +"\n"+ " Hora de entrada: " + horaEntrada ;
    }

    
}