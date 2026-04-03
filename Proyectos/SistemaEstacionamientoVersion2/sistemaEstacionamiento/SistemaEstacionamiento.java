package sistemaEstacionamiento;
import java.util.ArrayList;
import java.util.List;
import vehiculo.*;
import ticket.Ticket;
import ticket.Ticketable;
import espacio.Espacio;


public class SistemaEstacionamiento implements Ticketable{
    private String nombre;
    private static int totalEntradas=0;
    private static int totalSalidas=0;
    private static int consecutivoTicket =0; 
    private List<Espacio>espacios;
    private List<Ticket>tickets;


    public SistemaEstacionamiento(String nombre){
        if (nombre == null) throw new IllegalArgumentException("El nombre es obligatorio");
        this.nombre = nombre;
        this.espacios= new ArrayList<>();
        this.tickets= new ArrayList<>();
       
    }

    public Ticket registrarEntrada(Vehiculo vehiculo, Espacio espacio) {
        if (espacio == null) throw new IllegalArgumentException("El espacio es obligatorio");
        espacios.add(espacio);
        
        espacio.ocupar(vehiculo); //1
        totalEntradas++;
        consecutivoTicket++;
        String horaEntrada = vehiculo.getHoraEntrada(); //2
        String folio = "T-" + consecutivoTicket;
        Ticket t = new Ticket(folio,horaEntrada, vehiculo, espacio);
        System.out.println("\n==========Registrar entrada==========");
        System.out.println("[" + nombre + "] Entrada registrada");
        System.out.println(" " + vehiculo.obtenerResumen());
        System.out.println(" " + t.obtenerDetalle());
        System.out.println(t.entregado());
        System.out.println("Total entradas: " + totalEntradas);
        return t;

}
    public void registrarSalidas (Espacio e, Ticket t,String horaSalida, int horas){  
        
        System.out.println("\n==========Registrar salida==========");
        t.finalizar(horaSalida, horas);
        e.liberar();
        System.out.println("["+nombre+"] El espacio se ha liberado. Salida registrada");
    }

   
    public void generarTicket(Ticket t ){
    if (t == null) throw new IllegalArgumentException("Es obligatorio");
    System.out.println("\n==========Ticket==========");
    System.out.println(t.obtenerDetalle());
    totalSalidas++;
    System.out.println("Total salidas: " + totalSalidas);
    tickets.add(t);
    }

    public void calcularTotalTarifas(){
       double total=0;
        for (Ticket t: tickets){
            total +=t.getTotalPagar();
        }

        System.out.println("\n===============Ganancia total================");
        System.out.println(total);
    }

    public void obtenerEstadoEspacios(){
        int ocupados = 0;
        int libres = 0;
        for (Espacio e: espacios){
            if (e.estaLibre()){
                libres++;
            }
        else {
            ocupados++;
        }
    }
    System.out.println("\n==========Estado de estacionamiento=============");
    System.out.println("Espacios totales: "+ espacios.size());
    System.out.println("Espacios disponibles: " + libres);
    System.out.println("Espacios ocupados: "+ocupados);
    }
    
    
    
}