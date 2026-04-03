import java.util.Scanner;

public class ValidadorContraseña {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String contrasena;
        boolean valido;

        do {
            System.out.print("Ingresa una contraseña: ");
            contrasena = sc.nextLine();

            valido = true; // se asume válida hasta comprobar lo contrario

            // ----------------------------
            // 1. Validar longitud >= 8
            // ----------------------------
            // COMPLETAR:
            if (contrasena.length() < 8) {
                System.out.println("Error: mínimo 8 caracteres.");
                valido = false;
            }

            // ----------------------------
            // 2. Validar al menos una mayúscula
            // ----------------------------
            boolean tieneMayus = false;
            // COMPLETAR:
            // Recorrer la contraseña y marcar tieneMayus = true
            for (int i = 0; i < contrasena.length(); i++) {
                char c = contrasena.charAt(i);
                if (Character.isUpperCase(c)) {
                    tieneMayus = true;
                    valido = true;
                }
            }

            if (!tieneMayus) {
                System.out.println("Error: debe contener al menos una mayúscula.");
                valido = false;
            }

            // ----------------------------
            // 3. Validar al menos una minúscula
            // ----------------------------
            boolean tieneMinus = false;
            for (int i = 0; i < contrasena.length(); i++){
                char c= contrasena.charAt(i);
                if (Character.isLowerCase(c)){
                    tieneMinus = true;
                }
            }
            if(!tieneMinus) { 
                System.out.println("Error: debe contener al menos una minuscula.");
                valido = false;
                
            }
            // 4. Validar al menos un dígito
            boolean tieneDigito = false;
            for (int i = 0; i < contrasena.length(); i++){
                char c= contrasena.charAt(i);
                if (Character.isDigit(c)){
                    tieneDigito = true;
                }
            }

            if(!tieneDigito) { 
                System.out.println("Error: debe contener al menos un numero.");
                valido = false;
            }
            // ----------------------------
            // 5. Validar que NO existan espacios
            // ----------------------------
            for (int i = 0; i < contrasena.length(); i++) {
                char c = contrasena.charAt(i);
                if (Character.isWhitespace(c)) {
                    System.out.println("Error: no debe contener espacios.");
                    valido = false;
                    break;
                }
            }

            // Mensaje final si no es válida
            if (!valido) {
                System.out.println("La contraseña no cumple los requisitos. Intenta de nuevo.\n");
            }

        } while (!valido);

        System.out.println("Contraseña válida.");

        sc.close();
    }
}
