import java.util.InputMismatchException;
import java.util.Scanner;

public class Agenda {
        public static int opcion; 
    public static String normalizado;
    public static String[] nombre = new String[3]; // cantidad de contactos a ingresa
    public static String[] numTelefonicos = new String[3]; //Cantidad de numeros de telefono a ingresar
    public static String[] correos = new String[3]; // Cantidad de correos a ingresar.

   // Función para normalizar nombre
    public static String normalizarNombre(String nombre){  
        
        if ( nombre != null && nombre.trim().length() > 0) {
            return nombre; } 
        else {
            System.out.println("Sin nombre");
            return " ";
        }
    }

    //Función para validar telefono
    public static boolean telValido(String telefono){

        int cantidad = telefono.length();
            if(cantidad != 10){
            return false;      
            }
            else{
                return true;
            }
        }

        //Función para validar correo
        public static boolean correoValido(String correos) {
            if (correos== null || correos.length() == 0) {
                return false;  }
            int buscarArroba = correos.indexOf("@"); 
            if (buscarArroba > 0 && correos.contains(".") && correos.indexOf(".", buscarArroba ) > buscarArroba) {
                return true;}
            return false;
        }

        //Función para buscar contacto
    public static void buscarContacto(String nombreBuscado) {
        Scanner sc = new Scanner (System.in);
        if(nombreBuscado.equalsIgnoreCase(nombre[0])) {
                            System.out.println("");
                            System.out.println(" ");
                            System.out.println("================================ ");
                            System.out.println("===DATOS DEL USUARIO 1===");
                            System.out.println("Nombre: " + nombre[0]);
                             System.out.println("Telefono: " + numTelefonicos[0]);
                            System.out.println("Correo: " + correos[0]);
                        } else if(nombreBuscado.equalsIgnoreCase(nombre[1])) {
                            System.out.println("");
                            System.out.println(" ");
                            System.out.println("================================ ");
                            System.out.println("===DATOS DEL USUARIO 2===");
                            System.out.println("Nombre: " + nombre[1]);
                            System.out.println("Telefono: " + numTelefonicos[1]);
                            System.out.println("Correo: " + correos[1]);
                        } else if(nombreBuscado.equalsIgnoreCase(nombre[2])) {
                            System.out.println("");
                            System.out.println(" ");
                            System.out.println("================================ ");
                            System.out.println("===DATOS DEL USUARIO 3==== ");
                            System.out.println("Nombre: " + nombre[2]);
                            System.out.println("Telefono: " + numTelefonicos[2]);
                            System.out.println("Correo: " + correos[2]);
                        } else {
                            System.out.println("Usuario no encontrado.");
                            System.out.println(" ");
                            }
        
         }
         //Procedimiento de resumen de contactos 
        public static void resumenDeContactos() {
        Scanner sc = new Scanner (System.in);
         System.out.println("");
         System.out.println(" ");
         for(int i=0; i<3; i++){
         System.out.println("==CONTACTO " + (i+1) + "===");
         System.out.println(" Nombre: " + nombre[i]);
         System.out.println(" Telefono: " + numTelefonicos[i]);
         System.out.println(" Correo: " + correos[i]);   
                                }   
         }
        // Función MENU
            public static void mostrarMenu() {
                Scanner sc = new Scanner (System.in);
                System.out.println("=======MENÚ PRINCIPAL======== ");
                System.out.println("Elija una opción:");
                System.out.println("1. Registrar contacto 1");
                System.out.println("2. Registrar contacto 2");
                System.out.println("3. Registrar contacto 3");
                System.out.println("4. Buscar contacto");
                System.out.println("5. Mostrar todos los contactos");
                System.out.println("6. Salir");
                opcion = sc.nextInt();           
            sc.nextLine();
                }
        
// funcion MAIN (programa principal)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

         try{
            mostrarMenu();
        }catch (InputMismatchException e) {
            System.out.println(" Error: Debes ingresar solo números. Intenta de nuevo.");
            System.out.println(""); 
        } finally {
       
    }
        switch (opcion) {
            case 1:
            
                        System.out.println(" ");
                        System.out.println("================================ ");
                        System.out.println("======REGISTRO DE USUARIO 1========= ");
                        System.out.println("Ingrese los datos del usuario 1: ");
                        System.out.println("Ingrese su nombre: ");
                        nombre[0] = sc.nextLine(); 
                        normalizarNombre(nombre[0]);
                        do {
                            System.out.print("Ingrese su teléfono: ");

                            numTelefonicos[0] = sc.nextLine();
                            if (!telValido(numTelefonicos[0])) {
                                System.out.println("Error vuelva a intentarlo");
                                 System.out.println("");
                            }
                        } while (!telValido(numTelefonicos[0]));
                        do {
                            System.out.println("Ingrese su correo: ");
                        correos[0] = sc.nextLine();
                            if (!correoValido(correos[0])) {
                                System.out.println("Error vuelva a intentarlo");
                                System.out.println(""); } 
                        else {
                                System.out.println("Correo guardado.");
                            }   
                            
                        } while (!correoValido(correos[0])); 
                        mostrarMenu();
            case 2:
                        System.out.println(" ");
                        System.out.println("================================ ");
                        System.out.println("Ingrese los datos del usuario 2: ");
                        System.out.println("Ingrese su nombre: ");
                        nombre[1] = sc.nextLine();
                        normalizarNombre(nombre[1]);
                        do {
                            System.out.print("Ingrese su teléfono: ");
                            numTelefonicos[1] = sc.nextLine();
                            if (!telValido(numTelefonicos[1])) {
                                System.out.println("Error Vuelva a intentarlo");
                                 System.out.println("");
                            }
                        } while (!telValido(numTelefonicos[1]));

                         do {
                            System.out.println("Ingrese su correo: ");
                        correos[1] = sc.nextLine();
                            if (!correoValido(correos[1])) {
                                System.out.println("Error Vuelva a intentarlo");
                                System.out.println(""); } 
                        else {
                                System.out.println("Correo guardado.");
                            }   
                            
                        } while (!correoValido(correos[1]));
                        mostrarMenu();
            case 3:
                        System.out.println("");
                        System.out.println("================================ ");
                        System.out.println("Ingrese los datos del usuario 3: ");
                        System.out.println("Ingrese su nombre: ");
                        nombre[2]= sc.nextLine();
                        normalizarNombre(nombre[2]);
                        do {
                            System.out.print("Ingrese su teléfono: ");
                            numTelefonicos[2] = sc.nextLine();
                            if (!telValido(numTelefonicos[2])) {
                                System.out.println("Error Vuelva a intentarlo");
                                 System.out.println("");
                            }
                        } while (!telValido(numTelefonicos[2]));

                        do {
                            System.out.println("Ingrese su correo: ");
                        correos[2] = sc.nextLine();
                            if (!correoValido(correos[2])) {
                                System.out.println("Error Vuelva a intentarlo");
                                System.out.println(""); } 
                        else {
                                System.out.println("Correo guardado.");
                            }   
                            
                        } while (!correoValido(correos[2]));
                        mostrarMenu();                   
            case 4:
                        System.out.println("");
                        System.out.println("================================ ");
                         System.out.println("BUSCADOR DE USUARIO  ");
                        System.out.println("Ingrese el nombre del usuario a buscar: ");
                        String nombreBuscado = sc.nextLine();
                        buscarContacto(nombreBuscado);
                        mostrarMenu();
                        sc.nextLine();
            case 5:
                    resumenDeContactos();
                    mostrarMenu();
            case 6:
            System.out.println("================================ ");
            System.out.println("Saliendo del programa...");
            break;
            default:
                        System.out.println("Opción no válida");
                        mostrarMenu();
            }
            }
        } 
    
