public class Main {
    
    public static void main (String[] args){
        Usuario u1 = new Usuario("Cinthia", 400.00);

        Conductor c1 = new Conductor("Daniel");

        System.out.println("El usuario es: "+u1.getNombre() + "  " + u1.getSaldo());
        System.out.println("Usuarios registrados: "+Usuario.totalUsuarios);
        System.out.println("El conductor es: "+c1.getNombre());
        System.out.println("Conductores registrados: "+ Conductor.totalConductores);
    }
}
