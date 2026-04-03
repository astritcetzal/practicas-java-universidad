import java.util.InputMismatchException;
import java.util.Scanner;
//POSIBLE OPCIÓN

public class SumaDeDigitos {
    //Variable global
    public static int numDIG ;

      static void procedimiento ( int numDIG ){
        Scanner sc = new Scanner(System.in);
        try {
         if (numDIG == 1){ 
            System.out.println("Ingrese 3 números enteros separados por coma (ejemplo: 45,78,168):");
            String dig = sc.nextLine(); // <- Solo una entrada 
            String[] partes = dig.split(","); // Dividir la entrada en partes   
            int[] Lista = new int[3]; // Crear un arreglo para almacenar los números
            
           // .length obtiene el tamaño del arreglo
            for (int n=0; n < Lista.length; n++){ // Iterar para llenar el arreglo
                Lista[n]= Integer.parseInt(partes[n]);// Convertir cada parte a entero y almacenarla
                    } 
            String resultado = ""; // Variable para almacenar el resultado. 
            for (int n=0; n < Lista.length; n++){ // para cada número en la lista
                // Iterar para calcular las sumas de los dígitos
                int numero = Lista[n];
                int sumaDigitos = 0; // Variable para almacenar la suma de los dígitos

                while (numero > 0) { // Mientras queden dígitos por procesar
                    sumaDigitos += numero % 10; // Extrae el último dígito
                    numero /= 10;               // Elimina el último dígito
                }

                resultado += sumaDigitos + " "; // Agrega la suma de los dígitos al resultado 
         }System.out.println("Suma : " + resultado.trim()); //  Mostrar el resultado
                
        }else {
           System.out.println("Saliendo...");}       
    }
        catch (InputMismatchException e){
            System.out.println("Entrada invalida. Por favor ingresa un numero entero.");
            sc.next(); // Limpiar el buffer
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Menú de opciones
        try {
        System.out.println("Elige una opción:" );
        System.out.println("1. Esccribir 3 numeros enteros de más de 1 digito");
        System.out.println("2. Salir");
        int numDIG= sc.nextInt(); // Leer la opción del usuario
        sc.nextLine(); // Limpiar el buffer
        // Procesar la opción seleccionada
        procedimiento(numDIG); }
        catch (InputMismatchException e){
            System.out.println("Entrada invalida. Por favor ingresa un numero entero.");
            sc.next(); // Limpiar el buffer
        }finally  {

    System.out.println("Ejecución finalizada. Cerrando recursos...");

sc.close();
        }
}
}

/* 
 INICIO

	//Variable global
	int numDIG

	//Proceso 
	Definir FUNCIÓN procedimiento (ENTERO numDIG)
	
		SI (numDid <- 1) entonces 
			MOSTRAR "Ingrese 3 números enteros separados por coma (ejemplo: 45,78,168):"
			LEER dig //string Lista de números
			Partes (string) <- dig.separar (.split)  
			Lista (int) <- arreglo de números
				PARA ( (int) n <- 0, n menor a la longitud de la lista, n + 1  )
				Lista [n] <- ConvertirEnteroAlmacenarla
				resultado (string) <- AlmacenarResultado

				PARA ( (int) n <- 0, n menor a la longitud de la lista, n + 1  )
					numero (int) <- Lista [n]
					sumaDigitos (int)<-0 //Almacena los dígitos
				
				MIENTRAS numero sea mayor a 0
					sumaDigitos <- sumaDigitos + (numero MOD 10)   
					numero <- numero DIV 10
				
					resultado <- resultado + sumaDigitos " "
				MOSTRAR "Suma: ", resultado

		SINO 
			MOSTRAR "Saliendo..."
		FIN_SI
	FIN_FUNCION

	//Programa principal
	MOSTRAR "Elige una opción"
	MOSTRAR "1. 2 dígitos"
	MOSTRAR "2. Salir"
	LEER numDIG (int)
	
	LEER procedimiento (numDIG)

FIN
 */