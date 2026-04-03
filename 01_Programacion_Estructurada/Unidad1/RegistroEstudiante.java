import java.io.*;
import java.util.*;

public class RegistroEstudiante {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);

        //Entrada de datos 
        System.out.print("Nombre completo:");
        String nombre = sc.nextLine();

        System.out.print("Edad:");
        int edad = sc.nextInt();

        System.out.print("Promedio (Base 10):");
        double promedio = sc.nextDouble();
        System.out.print("Inicial de su grupo (A, B o C):");
        char grupo = sc.next().charAt(0);

        System.out.print("¿Está inscrito?(true/false):");
        boolean inscrito = sc.nextBoolean();

        //Procesamiento
        String nombreMayus = nombre.toUpperCase();
        int longitudNombre = nombre.length();

        //Type casting double -> int
        int promedioEntero= (int) promedio;

        boolean aprueba = (promedio >= 7);

        //Escritura en arvchivo 
        PrintWriter pw = new PrintWriter("estudiante.txt");
        pw.println("Nombre:" + nombreMayus);
        pw.println("Edad:" + edad);
        pw.println("Promedio:" + promedio);
        pw.println("Promedio (entero por casting):" + promedioEntero);
        pw.println("Grupo:" + grupo);
        pw.println("Inscrito:" + inscrito);
        pw.println("Longitud del nombre:"+ longitudNombre);
        pw.println("¿Aprobado?:" + aprueba);
        pw.close();

        System.out.println("Datos guardados en estudiantes.txt");
        
        //Lectura del archivo
        Scanner scArchivo = new Scanner(new File("estudiante.txt"));
        System.out.println("Contenido del archivo:");
        while (scArchivo.hasNextLine()) {
            System.out.println (scArchivo.nextLine());
        }

        sc.close();
        scArchivo.close();

    }
    
}
