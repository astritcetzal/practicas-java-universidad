public class Main {
    public static void main(String[] args) {
        Reservacion reserva = new Reservacion(05);
        try{
            reserva.reservar(6);
        }catch(SinAsientosException e){
            System.out.println("Excede de la capacidad máxima: " + e.getAsientosDisponibles());
            System.out.println(e.getMessage());
        }
    }
    
}
