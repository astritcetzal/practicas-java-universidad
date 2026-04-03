public class SinAsientosException extends Exception{
    private int asientosSolicitados;
    private int asientosDisponibles = 5;


    public SinAsientosException(String mensaje, int asientosSolicitados, int asientosDisponibles){
        super(mensaje);
        this.asientosSolicitados = asientosSolicitados;
        this.asientosDisponibles = asientosDisponibles;

    }

    public int getAsientosSolicitados(){
        return asientosSolicitados;
    }

    public int getAsientosDisponibles(){
        return asientosDisponibles;
    }

}


/*
public class IDJugadorDuplicadoException extends Exception{
private String id;
public IDJugadorDuplicadoException (String id){
    super("El ID ya está registrado1: "  + id);
    this.id = id;
}
    public String getId(){
        return id;
    }

}

*/