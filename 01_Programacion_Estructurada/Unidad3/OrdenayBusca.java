import java.util.Arrays;
import java.util.Scanner;
public class OrdenayBusca {
    public static int[] lista = new int [10];

    public static void ordenamientoBurbuja(int[] A) {
            for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A.length - 1 - i; j++) {
            if (A[j] > A[j + 1]) { // menos a mayor
            int temp = A[j];
            A[j] = A[j + 1];
            A[j + 1] = temp; } 
        } 
    } 
    }
    public static int busquedaLineal(int[] A, int x) {
        for (int i = 0; i < A.length; i++)
        if (A[i] == x) return i;
        return -1;
}
    public static void main (String [] args){
    Scanner sc =new Scanner (System.in);
    
    int i;
        //para ingresar los valores
        for ( i = 0; i < lista.length; i ++ ) {
            System.out.println("Ingresa el valor " + (i +1)+":");
            int numero = sc.nextInt();
            lista [i] = numero;
        }
        ordenamientoBurbuja(lista);
        System.out.println("Lista ordenada" + Arrays.toString(lista));
       
        System.out.println("Ingresa un numero");
            int num= sc.nextInt();
            int list = busquedaLineal(lista, num);
            if (list != -1){
            System.out.println("El número se encontró");
            System.out.println("El numero está en la posición: " + list);
            }
            else {
                System.out.println("El numero no se encontró");
            }
    }
}