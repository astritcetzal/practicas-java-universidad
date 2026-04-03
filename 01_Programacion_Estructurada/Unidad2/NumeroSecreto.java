import java.util.InputMismatchException;
import java.util.Scanner;
public class NumeroSecreto {    
    static void mostrarMensaje (String nombre) {

      // 2. Cuerpo o bloque del procedimiento
      System.out.println("Bienvenido, " + nombre + "!");}

      // Función: calcula el puntaje sumando base y bonificación
    public static int sumar(int base, int bonificacion) {
        int resultado = base + bonificacion;
        return resultado;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        
        int numSecreto= (int)(Math.random() *10) +1;
        int contador=0;
        int intento =0;
        System.out.println("Adivina el numero secreto (entre 1 y 10)");
        mostrarMensaje("Usuario");
        do { System.out.println("Escribe tu intento:");
        try{
         intento = sc.nextInt();   
         contador++;

        if (intento > numSecreto){
        System.out.println("Muy alto. Intenta con un numero menor.");
        }
        else if (intento < numSecreto)
        {System.out.println("Muy bajo. Intenta con un numero mayor.");}
        } catch (InputMismatchException e){
            System.out.println("Entrada invalida. Por favor ingresa un numero entero.");
            sc.next(); // Limpiar el buffer
        }
        }
        while ( intento !=numSecreto);
        
        System.out.println("¡Correcto! El numero secreto es"+ numSecreto);
        System.out.println("Numero de intentos: " + contador);
        int basePuntaje = 10;
        int bonificacion = (contador <= 3) ? 5 : 0; // bonificación si adivinó rápido
        int puntajeFinal = sumar(basePuntaje, bonificacion);
       System.out.println("Tu puntaje final es: " + puntajeFinal);
        sc.close();
      
}

}