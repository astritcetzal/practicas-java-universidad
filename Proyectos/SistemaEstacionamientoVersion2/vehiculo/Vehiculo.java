package vehiculo;
public abstract class Vehiculo {
    
    protected String placa;
    protected String horaEntrada;

    //validaciones
    public Vehiculo (String placa, String horaEntrada){
        if (placa == null) throw new IllegalArgumentException("La placa es obligatoria");
        if (horaEntrada== null) throw new IllegalArgumentException("La hora de entrada es obligatoria");
        this.horaEntrada = horaEntrada;
        this.placa = placa;

    }

    public abstract double calcularTarifa(int horas);
    
    public String obtenerResumen(){      
        return "El vehiculo con placas: " +placa + "\n" + "Hora de entrada: " + horaEntrada ;
    }

    public String getPlacas(){
        return placa;
    }   

    public String getHoraEntrada(){
        return horaEntrada;
    }
    
}

