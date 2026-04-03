import java.util.Scanner;
public class MenuRecursivo {
static final Scanner sc = new Scanner(System.in);
        //variables globales

        static String Comidaveg = "";
        static String Comidanoveg = "";
        static String bebidacon = "";
        static String bebidasin = "";
        static String postresalado = "";
        static String postredulce = "";
    //Funcion menú
    public static void mostrarMenu(){
        //variables
            int opcion;
            int opcComida;
            int opcBebida;
            int opcPostre;
        
            //Entrada de datos
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
            //Proceso
            switch (opcion) {
                case 1:
                System.out.println("¿Es vegano? (1 = Sí / 2 = No)");
                opcComida = sc.nextInt();
                sc.nextLine(); // ← limpia el salto de línea

                    switch (opcComida) {
                        case 1:
                            System.out.println("--- Menú vegano ---");
                            System.out.println("\nEnsalada");
                            System.out.println("Frutas");
                            System.out.println("Verduras");
                            System.out.print("Escriba su respuesta:");
                            Comidaveg = sc.nextLine(); // ahora sí puedes escribir  
                            mostrarMenu();  //SE LLAMA A MENÚ
                
                            break;
                        case 2:
                            System.out.println("--- Menú no vegano ---");
                            System.out.println("\n1. Carne");
                            System.out.println("2. Pescado");
                            System.out.println("3. Lácteos");
                            System.out.print("Escriba su respuesta: ");
                             Comidanoveg = sc.nextLine();
                            System.out.flush(); ///
                            mostrarMenu(); //SE LLAMA A MENÚ
                            break;

                        default:
                            System.out.println("Opción inválida, intenta otra vez.");
                            mostrarMenu(); //SE LLAMA A MENÚ
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
                            System.out.print("Escriba su respuesta:");
                            bebidacon = sc.nextLine();
                            mostrarMenu(); //SE LLAMA A MENÚ
                            break;
                        case 2:
                            System.out.println("---Menu sin alcohol---");
                            System.out.println("\nAgua");
                            System.out.println("Refresco");
                            System.out.println("Jugo");
                            System.out.print("Escriba su respuesta: ");
                            bebidasin = sc.nextLine();
                            mostrarMenu(); //SE LLAMA A MENÚ
                            break;
                        default:
                        System.out.println("Opción no válida. Intenta de nuevo.");
                         mostrarMenu(); //SE LLAMA A MENÚ

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
                            mostrarMenu(); //SE LLAMA A MENÚ
                            break;
                        case 2:
                            System.out.println("---Menu de postres dulces---");
                            System.out.println("\nPastel");
                            System.out.println("Helado");
                            System.out.println("Fruta");
                            System.out.print("Escriba su respuesta: ");
                            postredulce = sc.nextLine();
                            mostrarMenu(); //SE LLAMA A MENÚ
                            break;
                        default:
                        System.out.println("Opción no válida. Intenta de nuevo.");
                        mostrarMenu(); //SE LLAMA A MENÚ
                       }
                    break;
                     
                    case 4:  
                    //salida de los datos
                    System.out.println("                ");
                    System.out.println("                 ");
                    System.out.println("------TICKET------");
                    System.out.println( "Comida: " + Comidaveg + Comidanoveg );
                    System.out.println( "Bebida: " + bebidacon + bebidasin );
                    System.out.println( "Postre: " + postresalado + postredulce );
                    System.out.println("Gracias por usar el programa.");
                    System.out.println("Fin del programa.");
                            return; // CASO BASE
                    
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    mostrarMenu(); //SE LLAMA A MENÚ
            }
        }

        //se muestra el menu 
            public static void main(String[] args) {         
     Scanner sc = new Scanner(System.in);
      mostrarMenu(); //SE LLAMA A MENÚ
                sc.close();
}
}