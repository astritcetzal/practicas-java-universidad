package vehiculo;
public class Auto extends Vehiculo {

    private String tipo;

    public Auto(String placa, String horaEntrada, String tipo){
        super(placa, horaEntrada);
        if (tipo == null) throw new IllegalArgumentException("El tipo de vehiculo es obligatorio");
        this.tipo = tipo;
        
    }

    @Override
    public double calcularTarifa(int horas) {
        if (horas == 0) throw new IllegalArgumentException("Ponga un numero o que sea mayor a 0");
        return horas * 25.00;
    }

    @Override
    public String obtenerResumen(){
        return "El vehiculo con placas: " + placa + "\n" +"Tipo:  "+ tipo + "\n"+ "Hora de entrada: " + horaEntrada;
    }


    
}