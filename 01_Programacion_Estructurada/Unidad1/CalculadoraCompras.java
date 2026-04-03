import java.util.Scanner;
public class CalculadoraCompras{
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);

        //Entrada de datos
        System.out.println("Nombre del cliente:");
        String nombre = sc.nextLine();
        System.out.println("Producto:");
        String producto=sc.nextLine();
        System.out.println("Cantidad de productos:");
        int cantidad =sc.nextInt();
        System.out.println("Precio unitario:");
        int precio= sc.nextInt();
        System.out.print("¿El cliente es frecuente?(true/false):");
        boolean respuesta= sc.nextBoolean();

        //Procesamiento
        String nombreMayus =nombre.toUpperCase();
        int longitudNombre =nombre.length();
        int total= (cantidad*precio);
        char primeraLetra = producto.charAt(0);

        //Salida de datos
        System.out.println("=RECIBO DE COMPRA=");
        System.out.println("Cliente:" + nombreMayus);
        System.out.println("Longitud del nombre:" + longitudNombre);
        System.out.println("Producto:" + producto);
        System.out.println("Inicial de producto:" + primeraLetra);
        System.out.println("Cantidad:" + cantidad);
        System.out.println("Precio unitario:" + precio);
        System.out.println("¿Cliente frecuente?:" + respuesta);
        System.out.println("TOTAL A PAGAR:" + total);
        sc.close();
    }
  
}
