public class Ticket {
    private String folio;
    private String horaEntrada;
    private String horaSalida;
    private String estado;
    private Vehiculo vehiculo;
    private Espacio espacio;


    public Ticket (String folio, String horaEntrada, Vehiculo vehiculo, Espacio espacio){
        this.folio = folio;
        this.horaEntrada = horaEntrada;
        this.horaSalida= "N/A";
        this.estado = "Abierto";
        this.vehiculo =vehiculo;
        this.espacio = espacio;
    }
    
    public void finalizar (String horaSalida, String estado){

        this.horaSalida = horaSalida;
        this.estado = "Cerrado";

        System.out.println("Hora salida: "+horaSalida +" - Estado: "+ estado);
    }

    public String obtenerDetalle(){

        String situacion= entregado()? "Vehiculo recogido" : "Vehiculo estacionado";
        if (vehiculo!= null && espacio !=null){
            String placa = vehiculo.getPlacas(); //4 //se duplicaba por eso lo elimine al igual que la hotraEntrada
            int esp= espacio.getNumero(); //5

            return "Folio: " +folio+". \n"+"PLaca: "+ placa+". \n" +"Espacio: "+ esp+". \n"+ "Hora de salida: " + horaSalida+". \n" + "Estado: " + estado+". \n" + "Situación: " + situacion ;
        }
            else {
            return "No fueron proporcionados los datos completos";}
    
    }

    public boolean entregado(){
        return "Cerrado".equals(estado);
    }
    
}
