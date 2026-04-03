import java.util.InputMismatchException;
import java.util.Scanner;

public class ArregloEnMarcha {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arregloOriginal = new int[10];
        int[] arreglo;
        int opcion;

        try {
            // Ingresar los valores del arreglo
            for (int i = 0; i < 10; i++) {
                System.out.print("Ingrese el valor " + (i + 1) + ": ");
                arregloOriginal[i] = sc.nextInt();
            }

            // Crear copia del arreglo original
            arreglo = arregloOriginal.clone();

            do {
                System.out.println("\n===== MENÚ PRINCIPAL =====");
                System.out.println("1. Mostrar arreglo original y actual");
                System.out.println("2. Contar números pares");
                System.out.println("3. Invertir arreglo");
                System.out.println("4. Ordenar arreglo (Método Burbuja)");
                System.out.println("5. Buscar número (Búsqueda Binaria)");
                System.out.println("6. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        MostrarArreglo(arregloOriginal, arreglo);
                        break;

                    case 2:
                        ParesArreglo(arreglo);
                        break;

                    case 3:
                        InvertirArreglo(arreglo);
                        break;

                    case 4:
                        OrdenArreglo(arreglo);
                        break;

                    case 5:
                        BusquedaArreglo(arreglo);
                        break;

                    case 6:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                        break;
                }

            } while (opcion != 6);

            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("No se puede ingresar caracteres");
        }
    }

    // Función para mostrar el arreglo original y actual
    public static void MostrarArreglo(int[] arregloOriginal, int[] arreglo) {
        System.out.println("Arreglo ORIGINAL:");
        for (int i = 0; i < arregloOriginal.length; i++) {
            System.out.print(arregloOriginal[i] + " ");
        }
        System.out.println();

        System.out.println("Arreglo ACTUAL:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    // Función para contar números pares
    public static void ParesArreglo(int[] arreglo) {
        int totalPares = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 == 0) {
                totalPares++;
            }
        }
        System.out.println("Cantidad de números pares: " + totalPares);
    }

    // Función para invertir arreglo
    public static void InvertirArreglo(int[] arreglo) {
        int temp;
        for (int i = 0; i < arreglo.length / 2; i++) {
            temp = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - 1 - i];
            arreglo[arreglo.length - 1 - i] = temp;
        }
        System.out.println("Arreglo invertido correctamente.");
    }

    // Función para ordenar arreglo (método burbuja)
    public static void OrdenArreglo(int[] arreglo) {
        int temp;
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        System.out.println("Arreglo ordenado correctamente.");
    }

    // Función para búsqueda binaria
    public static void BusquedaArreglo(int[] arreglo) {
        System.out.print("Ingrese número a buscar: ");
        int numBuscar = sc.nextInt();
        boolean encontrado = false;
        int inicio = 0, fin = arreglo.length - 1, pos = -1;

        while (inicio <= fin && !encontrado) {
            int medio = (inicio + fin) / 2;
            if (arreglo[medio] == numBuscar) {
                encontrado = true;
                pos = medio;
            } else if (arreglo[medio] > numBuscar) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }

        if (encontrado) {
            System.out.println("Número encontrado en la posición: " + pos);
        } else {
            System.out.println("Número NO encontrado en el arreglo.");
        }
    }
}
