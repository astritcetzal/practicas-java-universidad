/* PSEUDOCÓDIGO
INICIO 
        MOSTRAR "Escribe un año: "
        LEER dato 
        definir la función lambda = Bisiesto(dato entre cuatro = entero y dato entre 100 = decimal y dato entre 400 = decimal) 
        SI Bisiesto es verdadero ENTONCES
        MOSTRAR "True"
        SINO 
        MOSTRAR "False"
      FIN SI 
    FIN 
 */

    // Importar la clase Scanner con java.util
    // Sirve para poder leer datos que el usuario ingresa por teclado

 import java.util.Scanner;
 import java.util.function.IntPredicate;

 public class Bisiesto{

    public static void main(String[] args) {
        // Crea un objeto Scanner para leer datos desde el editor de código
        Scanner sc = new Scanner(System.in);

        // el bloque try contiene el código que puede generar una excepción (error)
    try{
        //Lambda para hacer la operación 
        IntPredicate Bisiesto = (dato) -> (dato % 4 == 0 && dato % 100 != 0) || (dato % 400 == 0);

        System.out.println("Escribe un año: ");
        int dato = sc.nextInt();

        // Si cumple las condiciones, imprime "True"
    if( Bisiesto.test(dato)) {
            System.out.println("True");
            

         // Si no cumple, imprime "False"
}   else {
            System.out.println("False");
        // El return termina la ejecución del método main y sale del programa
            
        } 
    }
     // Catch captura posibles errores (por ejemplo, si se ingresa texto en lugar de número)
    catch (Exception e){
            System.out.println("Detalle: " + e.getClass().getSimpleName());
        }

    // Este bloque siempre se ejecuta, haya o no errores
    finally {
            System.out.println("Busqueda finalizada. Cerrando recursos.");
    
        sc.close();
        
    
        }  
    }
}

 
