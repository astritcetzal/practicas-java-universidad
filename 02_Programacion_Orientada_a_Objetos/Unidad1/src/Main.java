public class Main {
   public static void main (String [] args){
            usuario u1 = new usuario ("Cinthia", 400.00); //constructor
            conductor c1= new conductor("Daniel");

            usuario u2 = new usuario ("Laura", 500.00); //constructor
            conductor c2= new conductor("Felipe");

            usuario u3 = new usuario ("José", 120.00); //constructor
            
            
            System.out.println("El usuario es: " + u1.getnombre() + " "+ u1.getsaldo());
            System.out.println("Usuarios registrados: "+usuario.totalUsuarios);
            System.out.println("El usuario es: " + c1.getnombre());
            System.out.println("Conductores: "+conductor.totalConductores);
            System.out.println(" ");           
    
}}
/* System.out.println("El usuario es: " + u2.getnombre() + " "+ u2.getsaldo());
            System.out.println("Usuarios registrados: "+usuario.totalUsuarios);
            System.out.println("El usuario es: " + c2.getnombre());
            System.out.println("Conductores: "+conductor.totalConductores);

            System.out.println(" ");
            System.out.println("El usuario es: " + u3.getnombre() + " "+ u3.getsaldo());
            System.out.println("Usuarios registrados: "+usuario.totalUsuarios);
            System.out.println("El usuario es: " + c3.getnombre());
            System.out.println("Conductores: "+conductor.totalConductores); */