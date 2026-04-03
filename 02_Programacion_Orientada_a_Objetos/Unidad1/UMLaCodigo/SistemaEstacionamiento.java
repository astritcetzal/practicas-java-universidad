public class SistemaEstacionamiento {
    private String nombre;
    private static int totalEntradas=0;
    private static int totalSalidas=0;
   private Vehiculo v;
   private Espacio e;
   private Ticket t;

    public SistemaEstacionamiento(String nombre){
        this.nombre = nombre;
        totalEntradas ++;
        totalSalidas++;
    }
    public void registrarEntradas (Vehiculo v, Espacio e){
        // no funciona porque no estan las clases
    }

    public void registrarSalidas (Espacio e, Ticket t){
      //
    }
    public int getTotalEntradas(){
        return  0;
    }
    public int getTotalSalidas(){
        return 0;
    }
}
