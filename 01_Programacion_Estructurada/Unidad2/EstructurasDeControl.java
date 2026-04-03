
import java.util.Scanner;

public class EstructurasDeControl{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //Entrada de datos
        System.out.println("Ingrese su promedio: ");
        int promedio = sc.nextInt();
        

        // Codigo de if
     if((promedio >= 90)) {
            System.out.println("\n Excelente "); 
         } else if ((promedio >= 70 && promedio <= 89 )) {
            System.out.println("\n Aprobado "); 
         }
         else if ((promedio < 70)) {
            System.out.println("\n Reprobado ");
        }

            // Codigo de switch
        System.out.println("Ingrese un numero del 1 al 7: ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
            System.out.println("Hoy es Lunes " );

                
                break;
            case 2:
            System.out.println("Hoy es Martes " );
                
                break;
            case 3:
            System.out.println("Hoy es Miercoles " );

                break;

            case 4:
            System.out.println("Hoy es Jueves " );

                break;
            case 5:
            System.out.println("Hoy es Viernes " );

                break;
            case 6:
            System.out.println("Hoy es Sabado " );

                break;
            case 7:
            System.out.println("Hoy es Domingo " );

                break;
            default:
                break;
        }
        // Codigo de operador ternario


        
        System.out.println("Ingrese un numero: ");
        int numero= sc.nextInt();
        
        String resultado = (numero % 2)==0 ? "PAR":"IMPAR";
        System.out.println("El numero es: " + resultado);
        sc.close();


    }
    
}
