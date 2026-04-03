import java.io.*;
public class LecturaEscrituraBuffered {
    public static void main(String[] args)throws IOException{
        //Escritura
        BufferedWriter bw = new
BufferedWriter(new FileWriter("ejemplo.txt"));
        bw.write("Hola, este es un archivo de ejemplo con BufferedWriter.");
        bw.newLine();
        bw.write("Segunda linea escrita con BufferedWriter.");
        bw.close();
        //Lectura 
        BufferedReader br = new
BufferedReader(new FileReader("ejemplo.txt"));
        String linea;
        System.out.println("Contenido del archivo:");
        while((linea = br.readLine ())!= null) {
             System.out.println(linea);
            }
        br.close();
    }   
}
