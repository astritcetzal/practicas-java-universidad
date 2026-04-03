import java.util.InputMismatchException;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //pedir los valores
        try{
        System.out.println("Ingresa un numero");
        int inicio = sc.nextInt();
        System.out.println("Ingrese el ultimo numero");
        int fin = sc.nextInt();
        //esto es para llamar el proceso o como se diga (lo que nos enseño la maestra)
        System.out.println("Numeros pares entre " + inicio + " y " + fin + ": " + imprimirNumerosPares(inicio, fin));
        } catch (InputMismatchException e) {
            System.out.println("¡Error! Debes ingresar un número entero, no una letra.");
        } 

        sc.close();
    }

    //este es el proceso con for
        public static String imprimirNumerosPares(int inicio, int fin) {
            String pares = "";

            for(int i = inicio; i <= fin; i++){ 
            if (i % 2 == 0){
                pares += i + " ";
            }

        }
         return pares;
    }

}

/*
INICIO
    // Declarar variables
    DEFINIR inicio, fin COMO ENTERO
    DEFINIR pares COMO CADENA

    // Pedir los valores al usuario
    ESCRIBIR "Ingresa un número:"
    LEER inicio
    ESCRIBIR "Ingresa el último número:"
    LEER fin

    // Llamar al proceso para obtener los números pares
    pares ← imprimirNumerosPares(inicio, fin)

    // Mostrar el resultado
    ESCRIBIR "Números pares entre ", inicio, " y ", fin, ": ", pares

FIN

PROCESO imprimirNumerosPares(inicio, fin)
    DEFINIR pares COMO CADENA ← ""

    PARA i ← inicio HASTA fin HACER
        SI (i MOD 2 = 0) ENTONCES
            pares ← pares + i + " "
        FIN SI
    FIN PARA

    RETORNAR pares
FIN PROCESO

 */