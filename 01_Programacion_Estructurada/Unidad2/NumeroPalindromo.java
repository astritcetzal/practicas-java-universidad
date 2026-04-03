
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroPalindromo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       try{
        //catch para manejar que no meta letras
        
         System.out.println("Ingrese el numero a comparar ");
        int numero = sc.nextInt();
        
        //convertir a String
        String numString = String.valueOf(numero);
        //invertir el String
        String numInvertido = new StringBuilder(numString).reverse().toString();
        //comparar el numero original con el invertido
        boolean esIgual = numString.equals(numInvertido);
        System.out.println("El numero es un palindromo? " + esIgual);
       }catch (InputMismatchException e) {
            System.out.println("¡Error! Debes ingresar un número entero, no una letra.");
        } finally 
        {
            sc.close(); 
        }
    }
}

/*
 pseudocodigo
 INICIO
    INTENTAR
    Mostrar "Ingrese lista de numeros:"
    LEER numero
    CONVERTIR numero A cadena numString
    INVERTIR numString A numInvertido
    COMPARAR si numString ES IGUAL A numInvertido
    ESCRIBIR "¿El número es un palindromo? " + false/true
    CAPTURAR InputMismatchException
        MOSTRAR "¡Error! Debes ingresar un número entero, no una letra."
    FIN_INTENTAR
    
    FIN SI
 FIN
 */

 