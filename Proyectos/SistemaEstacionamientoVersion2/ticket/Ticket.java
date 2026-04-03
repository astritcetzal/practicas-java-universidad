package ticket;
import espacio.Espacio;
import vehiculo.*;

public class Ticket {
    private String folio;
    private String horaEntrada;
    private String horaSalida;
    private String estado;
    private Vehiculo vehiculo;
    private Espacio espacio;
    private double totalPagar;
    private int horasEstacionado;

    public Ticket (String folio, String horaEntrada, Vehiculo vehiculo, Espacio espacio){
        if (folio == null) throw new IllegalArgumentException("El folio es obligatorio");
        if (horaEntrada== null) throw new IllegalArgumentException("La hora de entrada es obligatorio");
        if (vehiculo == null) throw new IllegalArgumentException("El vehiulo es obligatorio");
        if (espacio== null) throw new IllegalArgumentException("El espacio es obligatorio");
        
        this.folio = folio;
        this.horaEntrada = horaEntrada;
        this.horaSalida= "N/A"; 
        this.estado = "Abierto";
        this.vehiculo =vehiculo;
        this.espacio = espacio;
        this.totalPagar = 0.0;
        
    }
    
    //cerrado
    public void finalizar (String horaSalida, int horas){
        this.horasEstacionado = horas;
        this.estado = "Cerrado";
        this.horaSalida = horaSalida;
        
        //Polimorfismo
        this.totalPagar = vehiculo.calcularTarifa(horas); //--
        System.out.println("Hora entrada: "+horaEntrada +"\n"+"Hora salida: "+ this.horaSalida +"\n"+  "Estado: "+ estado + "\n"+"horas Estacionado: "+ this.horasEstacionado);
    }

    public String obtenerDetalle(){
        String situacion= entregado()? "Vehiculo recogido" : "Vehiculo estacionado";
        if (vehiculo !=null){

            return "Folio: " +folio+" \n" + "Hora de salida: " + horaSalida+" \n" + "Estado: " + estado+". \n" + "Situación: " + situacion+". \n"  + "Total a pagar:"+  totalPagar ;
        }
            else {
            return "No fueron proporcionados los datos completos";}
    
    }

    //está cerrado
    public boolean entregado(){
        return "Cerrado".equals(estado);
    }

    public double getTotalPagar(){
        return this.totalPagar;
    }
    
}