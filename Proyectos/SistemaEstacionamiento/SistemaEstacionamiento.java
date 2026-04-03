public class SistemaEstacionamiento {
    private String nombre;
    private static int totalEntradas=0;
    private static int totalSalidas=0;
    private static int consecutivoTicket =0; 


    public SistemaEstacionamiento(String nombre){
        this.nombre = nombre;
    }
    public Ticket registrarEntrada(Vehiculo vehiculo, Espacio espacio) {

        espacio.ocupar(vehiculo); //1

        totalEntradas++;

        consecutivoTicket++;
        String horaEntrada = vehiculo.getHoraEntrada(); //2
        String folio = "T-" + consecutivoTicket;
        Ticket t = new Ticket(folio,horaEntrada, vehiculo, espacio);
        System.out.println("[" + nombre + "] Entrada registrada");
        System.out.println(" " + vehiculo.obtenerResumen());
        System.out.println(" " + t.obtenerDetalle());
        System.out.println(t.entregado());

return t;

}
    public void registrarSalidas (Espacio espacio){
        espacio.liberar();  
        totalSalidas++;
        System.out.println("["+ espacio +"] El espacio se ha liberado. Salida registrada");
      
    }
    public static int getTotalEntradas(){
        return  totalEntradas;
    }
    public static int getTotalSalidas(){
        return totalSalidas;
    }
}
