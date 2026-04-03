import java.util.Scanner;
public class ControlTotal {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     //declaracion de variables
        int opcion;
        int opcComida;
        int opcBebida;
        int opcPostre;
        String Comidaveg = "";
        String Comidanoveg = "";
        String bebidacon = "";
        String bebidasin = "";
        String postresalado = "";
        String postredulce = "";

        // mostrar el menú principal
        // el ciclo se repite mientras no elija 4
        do{
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("--- Restaurante ---");
            System.out.println("-----¿Qué deseas ordenar?-----");
            System.out.println("1. Comida");
            System.out.println("2. Bebida");
            System.out.println("3. Postre");
            System.out.println("4. Terminar de ordenar y salir");
            System.out.print("Elige una opción: ");      
            opcion = sc.nextInt();
            sc.nextLine(); // ← limpia el salto de línea
            switch (opcion) {
                case 1:
                System.out.println("¿Es vegano? (1 = Sí / 2 = No)");
                opcComida = sc.nextInt();
                sc.nextLine(); // ← limpia el salto de línea

                    switch (opcComida) {
                        case 1:
                            System.out.println("--- Menú vegano ---");
                            System.out.print("Escriba su respuetsa: ");
                            System.out.println("\nEnsalada");
                            System.out.println("Frutas");
                            System.out.println("Verduras");
                            System.out.print("Elige una opción: ");
                            Comidaveg = sc.nextLine(); // ahora sí puedes escribir   
                            break;
                        case 2:
                            System.out.println("--- Menú no vegano ---");
                            System.out.print("Escriba su respuesta: ");
                            System.out.println("\n1. Carne");
                            System.out.println("2. Pescado");
                            System.out.println("3. Lácteos");
                            System.out.print("Elige una opción: ");
                             Comidanoveg = sc.nextLine();
                            System.out.flush();
                            break;

                        default:
                            System.out.println("Opción inválida, intenta otra vez.");
                             continue; // vuelve al inicio del ciclo do-while con continuo 
                    }break;

                case 2:
                    System.out.println("BEBIDA con alcohol (SI=1 /NO=2)"); 
                    opcBebida =  sc.nextInt();
                    sc.nextLine(); // ← limpia el salto de línea
                    switch (opcBebida) {
                        case 1:
                            System.out.println("---Menu con alcohol---");
                            System.out.println("\n Vino");
                            System.out.println("Cerveza");
                            System.out.println("Cocktail");
                            System.out.print("Escriba su respuesta: ");
                            bebidacon = sc.nextLine();
                            break;
                        case 2:
                            System.out.println("---Menu sin alcohol---");
                            System.out.println("\nAgua");
                            System.out.println("Refresco");
                            System.out.println("Jugo");
                            System.out.print("Escriba su respuesta: ");
                            bebidasin = sc.nextLine();
                            break;
                        default:
                        System.out.println("Opción no válida. Intenta de nuevo.");
                            continue; // vuelve al inicio del ciclo do-while con continuo 
                    }
                    break;
                case 3:
                    System.out.println("POSTRE salado (SI 1 /NO 2)");
                    opcPostre = sc.nextInt();
                    sc.nextLine(); // ← limpia el salto de línea

                    switch (opcPostre) {
                        case 1:
                            System.out.println("---Menu de postres salados---");
                            System.out.println("\nMini tartaletas");
                            System.out.println("Crepas");
                            System.out.println("Empanadas");
                            System.out.print("Escriba su respuesta: ");
                            postresalado = sc.nextLine();
                            break;
                        case 2:
                            System.out.println("---Menu de postres dulces---");
                            System.out.println("\nPastel");
                            System.out.println("Helado");
                            System.out.println("Fruta");
                            System.out.print("Escriba su respuesta: ");
                            postredulce = sc.nextLine();
                            break;
                        default:
                        System.out.println("Opción no válida. Intenta de nuevo.");
                            continue; // vuelve al inicio del ciclo do-while con continuo
                    }
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                   continue; //vuelve al inicio del ciclo do-while con continuo
            }
            // el ciclo se repite mientras no elija 4
        } while (opcion != 4);
        System.out.println("                ");
        System.out.println("                 ");
        System.out.println("------TICKET------");
        System.out.println( "Comida: " + Comidaveg + Comidanoveg );
         System.out.println( "Bebida: " + bebidacon + bebidasin );
         System.out.println( "Postre: " + postresalado + postredulce );
        System.out.println("Gracias por usar el programa.");
        sc.close();


}

}
