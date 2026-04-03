public class Ticket {
    private String folio;
    private String horaEntrada;
    private String horaSalida;

    public Ticket (String folio, String horaEntrada, String horaSalida){
        this.folio = folio;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }
    
    public static void finalizar (String horaSalida){
        //
    }

    public String obtenerDetalle(){
        return "";
    }

    public boolean entregado(){
        return false;
    }

    
}
