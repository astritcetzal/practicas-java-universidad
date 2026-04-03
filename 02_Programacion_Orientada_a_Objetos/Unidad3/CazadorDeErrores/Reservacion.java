public class Reservacion  {
    private int asientosDisponibles;

    public Reservacion(int asientosDisponibles){
        this.asientosDisponibles = asientosDisponibles;
    }

    public void reservar(int cantidad) throws SinAsientosException{
        if (cantidad >  asientosDisponibles){
            throw new SinAsientosException("Sin asientos disponibles", cantidad, asientosDisponibles );
            
        }
        asientosDisponibles -= cantidad;
        System.out.println("Resercación exitosa. Quedan: " + asientosDisponibles);
    }
}
