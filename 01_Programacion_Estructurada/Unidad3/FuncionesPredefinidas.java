import java.util.Arrays;
import java.util.Scanner;

public class FuncionesPredefinidas {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int[] lista = new int [5];
        int i=0;
        for ( i = 0; i < lista.length; i ++ ) {
            System.out.println("Ingresa el numero:");
            int numero = sc.nextInt();
            lista [i] = numero;
        }
            System.out.println("Arreglo" + Arrays.toString(lista));      
            System.out.println("Suma de los elementos del arreglo: " + Arrays.stream(lista).sum());
            System.out.println("Promedio de los elementos: " +  Arrays.stream(lista).average().getAsDouble());
            System.out.println("Maximo de los elementos " + Arrays.stream(lista).max().getAsInt());
            System.out.println("Minimo de los elementos: " + Arrays.stream(lista).min().getAsInt());
            Arrays.sort(lista);
            System.out.println("Lista ordenada" + Arrays.toString(lista));
            System.out.println("Ingresa el numero a buscar: ");
            int n = sc.nextInt();
            if (Arrays.binarySearch(lista, n) >= 0) {
                System.out.println("\n El valor se encuentra en el índice " + Arrays.binarySearch(lista, n));
            } else {
                System.out.print("\n El valor no se encuentra en el arreglo.");
            }
    }
}