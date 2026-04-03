import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TextoInteligente {

    // Función: para mostrar el menú principal
    public static void menu() {
        System.out.println("\n===== MENÚ =====");
        System.out.println("1. Validar números telefónicos");
        System.out.println("2. Formatear y estandarizar correos electrónicos");
        System.out.println("3. Extraer fechas de un texto");
        System.out.println("4. Salir");
    }

    // Opción 1: Validar números telefónicos
    public static boolean validarTelefono(String telefono) {
        // Expresión regular para validar el formato (XXX) XXX-XXXX
        String patron = "^\\(\\d{3}\\) \\d{3}-\\d{4}$";

        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(telefono);

        return matcher.matches();
    }

    // Opción 2: Formatear y estandarizar correos electrónicos
    public static void procesarCorreos(Scanner sc) {

        System.out.println("\n---FORMATEAR Y VALIDAR CORREOS ELECTRÓNICOS---");
        System.out.println("Ingresa varios correos separados por comas (,)");
        System.out.println("Ejemplos:   yisus@gmail.com,  JOAKO@HOTMAIL.COM,   carlitos@outlook.com");
        System.out.print("Ingrese los correos: ");

        String entrada = sc.nextLine();

        // Separar los correos por la coma
        String[] correos = entrada.split(",");

        String patronCorreo = "^[a-zA-Z0-9._+-]+@[a-zA-Z0-9.]+\\.[a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(patronCorreo);

        System.out.println("\n-------------CORREOS----------");

        for (String correo : correos) {

            // Quitar los espacios y convertir los correos a minúsculas
            String limpio = correo.trim().toLowerCase();
            Matcher matcher = pattern.matcher(limpio);

            if (matcher.matches()) {
                System.out.println("CORREO VÁLIDO: " + limpio);
            } else {
                System.out.println("CORREO INVÁLIDO: " + limpio);
            }
        }

        System.out.println("------------------------------\n");
    }

    // Opción 3: Extraer fechas de un texto
    public static List<String> extraerFechas(String texto) {
        List<String> fechas = new ArrayList<>();
        String patron = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}\\b"; // año
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()) {
            fechas.add(matcher.group());
        }
        return fechas;
    }

    // Programa principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        // Ciclo del menú principal
        do {
            try {
                menu();
                opcion = sc.nextInt();
                sc.nextLine(); // limpiar el buffer

                switch (opcion) {

                    case 1: // Validar números telefónicos
                        System.out.println("\n--- VALIDAR NÚMERO TELEFÓNICO ---");
                        System.out.println("Ingrese un número telefónico con formato (XXX) XXX-XXXX:");
                        String telefono = sc.nextLine();

                        if (validarTelefono(telefono)) {
                            System.out.println("El número telefónico es VÁLIDO");
                        } else {
                            System.out.println("El número telefónico es INVÁLIDO");
                            System.out.println("Asegúrese de usar el formato: (XXX) XXX-XXXX");
                        }
                        break;

                    case 2: // Formatear y estandarizar correos electrónicos
                        procesarCorreos(sc);
                        break;

                    case 3: // Extraer fechas de un texto
                        System.out.println("\n--- Extraer fechas de un texto ---");
                        System.out.println("Ingrese un texto");
                        System.out.println("Ejemplo: El evento fue el 05/11/2025 y termina el 10/12/2025");
                        String texto = sc.nextLine();

                        if (texto.isEmpty()) {
                            System.out.println("Ingrese texto");
                            break;
                        }

                        List<String> lasfechas = extraerFechas(texto);

                        if (lasfechas.isEmpty()) {
                            System.out.println("No se encontró ninguna fecha en el texto.");
                        } else {
                            for (String fecha : lasfechas) {
                                System.out.println("- " + fecha);
                            }
                            System.out.println("Fechas en total: " + lasfechas.size());
                        }
                        break;

                    case 4: // Salir del programa
                        System.out.println("Saliendo del sistema...");
                        break;

                    default:
                        System.out.println("Opción no válida, intente de nuevo.");
                }

            } catch (Exception e) {
                System.out.println("Error general: " + e.getMessage());
                sc.nextLine(); // limpiar el buffer
            }

        } while (opcion != 4);

        sc.close();
    }
}
