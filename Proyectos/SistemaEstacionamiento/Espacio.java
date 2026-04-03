class Espacio {

    // Atributos
    private int numero;
    private String estado;
    private Vehiculo vehiculoActual;


    public Espacio(int numero){
        this.numero = numero;
        this.estado = "Libre" ;
        this.vehiculoActual = null;//
    }

    // Métodos
    public void ocupar(Vehiculo vehiculo){
        vehiculoActual = vehiculo;
        estado = "Ocupado";
    }

    public void liberar(){
        vehiculoActual = null;
        estado = "Libre";

    }

    public boolean estaLibre(){
        return "Libre".equalsIgnoreCase(estado);
    }
    public int getNumero(){  //
        return numero;
    }
    

}