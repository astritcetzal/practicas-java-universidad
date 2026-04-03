import java.util.Scanner;
public class ConversionTipos{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingresa un número entero:");
        int numero = sc.nextInt();

        //1. Conversión implícita (int-> double)
        double numDouble=numero;
        System.out.println("Conversión implícita (int -> double):" + numDouble);

        //2. Conversión explícita (double->)
        double decimal=9.87;
        int entero = (int) decimal;
        System.out.println("Conversión explicita(double->int):" + entero);
            //3.Conversión entre String y número
            String texto="123";
            int numParseado=Integer.parseInt(texto);//String ->int
            System.out.println("Conversión String -> int:"+ numParseado);

            int valor =456;
            String textoConvertido = String.valueOf(valor); //int -> String
            System.out.println("Conversión int-> String:"+textoConvertido);
            sc.close();
    }

}