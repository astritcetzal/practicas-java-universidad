import java.io.*;
import java.util.*;
public class LecturaEscritura {
    public static void main(String[] args) throws IOException {
        //Escritura en archivo
        PrintWriter pw=new
    PrintWriter("ejemplo.txt");
        pw.println("Hola, este es un archivo de ejemplo");
        pw.println("Segunda linea de texto");
        pw.close();
        //Lectura del archivo
        Scanner sc = new Scanner(new File("ejemplo.txt"));
        while(sc.hasNextLine()){
            String linea = sc.nextLine();
            System.out.println(linea);
        }
        sc.close();
        
    }
    
}
