import java.util.Scanner;
public class MayorOMenor {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int A=0;
        int B=0;
    do{
        System.out.println("Introduzca un primer valor");
        A= sc.nextInt();
        System.out.println("Introduzca un segundo numero");
        B = sc.nextInt();
} while(A==B);{
    if (A>B){
        System.out.println(A + " Es el mayor");
    }
    else {
        System.out.println(B + " Es el mayor");
    }
}

    }
}
