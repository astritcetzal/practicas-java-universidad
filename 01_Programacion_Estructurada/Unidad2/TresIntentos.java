import java.util.Scanner;

public class TresIntentos {
    
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int numSecreto= (int)(Math.random() *10) +1;
        int contador=0;
        int intento =0;
        System.out.println("Adivina el numero secreto (entre 1 y 10)");
        do { System.out.println("Escribe tu intento:");
         intento   = sc.nextInt();   
         contador++;  

        if (intento > numSecreto){
        System.out.println("Muy alto. Intenta con un numero mayor.");
        }
        else if (intento < numSecreto)
        {System.out.println("Muy bajo. Intenta con un numero mayor.");}
      
    }
        while ( contador<3 && intento != numSecreto);{
        System.out.println("El numero secreto era: "+ numSecreto);
        System.out.println("intentos terminados");
         } sc.close();
    

}
}