public class GrupoLlenoException extends Exception {
    private int capacidadMaxima;
    private int estudiantesActuales;
    public GrupoLlenoException (String mensaje, int capacidadMaxima, int estudiantesActuales){
        super(mensaje);
        this.estudiantesActuales = estudiantesActuales;
        this.capacidadMaxima= capacidadMaxima;
    }
    public int getCapacidadMaxima(){
            return capacidadMaxima;
    }
    public int getEstudiantesActuales(){
        return estudiantesActuales;
    }
}
