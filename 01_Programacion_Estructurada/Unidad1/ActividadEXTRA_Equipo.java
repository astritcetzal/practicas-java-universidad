import java.util.Scanner;

public class ActividadEXTRA_Equipo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Entrada de datos
        System.out.println("Ingrese su Nombre:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la direccion de entrega:");
        String direccion = sc.nextLine();
        System.out.println("Tipo de servicio (DHL, FEDEX, ESTAFETA):");
        String tipoServicio = sc.nextLine();
        System.out.println("Ingrese la distancia del envio (km):");
        double distanciaKm = sc.nextDouble();
        System.out.println("Ingrese el peso del paquete (kg):");
        double pesoKg = sc.nextDouble();

        //procesamiento de datos
        String nombreMayusculas = nombre.toUpperCase();
        int lonNombre = nombre.length();

        //delcaracion de variables
        double tarifaPeso = 0;
        double tarifaKm = 0;
        int diasEstimados = 0;


        // Calcular costo de envío
        if (tipoServicio.equalsIgnoreCase("DHL")) {
            tarifaPeso = 40; // Tarifa por kg
            tarifaKm = 2.0;   // Tarifa por km
            diasEstimados = 1;
        } else if (tipoServicio.equalsIgnoreCase("FEDEX")) {
            tarifaPeso = 30;
            tarifaKm = 1.5;
            diasEstimados = 3;
        } else if (tipoServicio.equalsIgnoreCase("ESTAFETA")) {
            tarifaPeso = 25;
            tarifaKm = 1.2;
            diasEstimados = 5;
        } 

        double costoBase = (tarifaPeso * pesoKg) + (tarifaKm * distanciaKm);
        double iva = (costoBase * 0.16); // Agregar IVA del 16%
        double total = Math.ceil(costoBase + iva);
        boolean aprobado = (pesoKg <= 30 && total <= 5000);


        
        // Mostrar el costo de envío
        System.out.println("------DETALLES DEL ENVÍO-------");

        System.out.println("Nombre del cliente : " + nombreMayusculas + " Longitud: " + lonNombre );
        System.out.println("Direccion de Entrega: " + direccion);
        System.out.println("Serivcio seleccionado: " + tipoServicio);
        System.out.println("Distancia del Envío: " + distanciaKm + " km");
        System.out.println("Peso del Paquete: " + pesoKg + " kg");
        System.out.println("IVA (16%): " + iva);
        System.out.println("Total Redondeo : " + total);
        System.out.println("Entrega estimada: " + diasEstimados + " días");
        System.out.println("Se aprobó el envío: " + aprobado);
        sc.close();
    }
}
    
