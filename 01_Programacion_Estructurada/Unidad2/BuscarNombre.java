import java.util.InputMismatchException;
import java.util.Scanner;

public class BuscarNombre {


    // 🔹 Función que busca un nombre en la lista (devuelve boolean)
    static boolean buscarNombre(String nombre, String[] lista) {
        nombre = nombre.toUpperCase(); // convierte a mayúsculas
        for (String elemento : lista) {
            if (elemento.equals(nombre)) {  // compara el texto
                return true;
            }
        }
        return false;
    }

    // 🔹 Procedimiento que imprime el resultado
    static void mostrarResultado(String nombre, boolean encontrado) {
        if (encontrado) {
            System.out.println("El nombre " + nombre + " se encuentra en la lista.");
        } else {
            System.out.println("El nombre " + nombre + " NO se encuentra en la lista.");
        }
    }

    // 🔹 Programa principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador=0;

        // Lista de nombres
        String[] nombres = {
            "MULAN","STICH","LILO","MERIDA","POCAHONTAS","DUMBO","ALICIA",
            "ARIEL","PLUTO","MICKEY","JAFAR","ALADDIN","HERCULES","BLANCANIEVES",
            "TONTIN","DOC","GRUÑON","TIMIDO","ESTORNUDON","DORMILON","FELIZ","URSULA","CENICIENTA"
        };

        // Entrada del usuario
        try { 
    do{
        System.out.print("Ingrese el nombre de un personaje de disney a buscar: ");
        String nombre = sc.nextLine();
            
        // Llamada a la función
        boolean resultado = buscarNombre(nombre, nombres);

        // Mostrar resultado (procedimiento)
        mostrarResultado(nombre, resultado);

       

        contador++;
 System.out.println(contador + "/3");
        } while ( contador <3  );
         System.out.println("Has alcanzado el número máximo de intentos."); 
    }  catch (Exception   e) {
            System.out.println("Error: entrada no válida");
            System.out.println("Detalle: " + e.getClass().getSimpleName()); }
         finally  {
    System.out.println("Ejecución finalizada. Cerrando recursos...");
    sc.close();
         }
    }
}
