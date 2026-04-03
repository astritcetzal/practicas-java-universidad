import java.util.Scanner;
public class Arreglos{
    public static void main (String [] args){
    Scanner sc =new Scanner (System.in);
    int[] lista = new int [5];
    int i;
        //para ingresar los valores
        for ( i = 0; i < lista.length; i ++ ) {
            System.out.println("Ingresa el numero:");
            int numero = sc.nextInt();
            lista [i] = numero;
        
        }
        System.out.println("a");
        i=0;
        // imprimir valores
        while (i < lista.length){
            System.out.println("Elemento: " + i + ": " + lista[i]);
            i++;
        }
        //suma, promedio, numero mayor
        int max = lista[0];
        int suma =0;
        //suma
        for ( int n: lista ){
            suma += n ;
            if (n> max) max =n;
        }
        System.out.println("Suma= " + suma );
        //promedio
        double promedio = (double) suma/lista.length;
        System.out.println("El promedio es: "+ promedio);

        //max

        System.out.println("El numero mayor es: " + max);

    }

    }