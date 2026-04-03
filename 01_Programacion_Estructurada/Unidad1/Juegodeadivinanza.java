import java.util.Scanner;
public class Juegodeadivinanza {
    public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa un numero del 1 al 10:");
    
    String numero = sc.nextLine();

    int secreto= (int)(Math.random() *10) +1;
    //proceso
    int numParseado= Integer.parseInt(numero);
    //compara
    boolean adivinaste= numParseado == secreto;
    System.out.println("¿Adivinó?" + adivinaste);
    System.out.println(secreto);

}

}
