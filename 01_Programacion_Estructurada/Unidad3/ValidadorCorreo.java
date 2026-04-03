import java.util.Scanner;

public class ValidadorCorreo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String correo;
        boolean valido = false;

        do {
            System.out.print("Ingresa un correo: ");
            correo = sc.nextLine().trim();  // elimina espacios al inicio y final

            // Reiniciar bandera de validación
            valido = true;

            // 1. Validar que no esté vacío
            if (correo.isEmpty()) {
                System.out.println("Correo inválido: no puede estar vacío.");
                valido = false;
            }

            // 2. Validar que contenga exactamente un '@'
            int posArroba = correo.indexOf('@');
            int posArrobaFinal = correo.lastIndexOf('@');

            // COMPLETAR: valida si falta @ o si hay más de uno
                if (posArroba ==-1){
                     System.out.println("Correo inválido: falta el @");
                   valido = false;
            }
            if (posArrobaFinal != posArroba){
                System.out.println("Correo invalido: hay mas de 1 arroba");
                valido = false;

            }
            // 3. Validar que antes del @ haya a l menos 1 caracter 
            // COMPLETAR:
                if (posArroba-1 < 0) { 
                    System.out.println("Correo invalido: antes del arroba escribe un texto");
                   valido = false;
                }

            // 4. Validar que después del @ exista al menos un "."
            // COMPLETAR:
                int posPunto = correo.indexOf('.', posArroba);
                if (posPunto <= 1) {
                    System.out.println("Correo invalido: Falta el (.)) ");
                   valido = false;
                }

            // 5. Validar que el dominio tenga al menos 2 letras
            // COMPLETAR:
            int posUltimoPunto = correo.lastIndexOf('.');
             String dominio = correo.substring(posUltimoPunto + 1);
             if ( dominio.length() <1 ) { 
                 System.out.println("Correo invalido: no tiene más de 2 letras despues del punto");
                   valido = false;
             }
        } while (!valido);

        System.out.println("\nCorreo válido.");
    }
}