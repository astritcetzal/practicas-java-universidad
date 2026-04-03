import java.util.Scanner;

public class EstudianteBeca {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        //Entrada de datos
        System.out.println("Ingrese la edad del estudiante:");
        int edad= sc.nextInt();
        System.out.println("Ingrese el rpomedio del estudiante:");
        int promedio= sc.nextInt();
        System.out.println("Ingrese la asitencia del estudiante (0-100):" );
        int asistencia= sc.nextInt();
        System.out.println("¿Pertenece a actividades extracurriculares? (true/false):");
        boolean actividades= sc.nextBoolean();

        //Operadores lógicos
        boolean  mayor18=edad>=18;
        boolean menorigual25=edad <= 25;
        boolean PROMEDIO= promedio >=80;
        boolean ASISTENCIA=asistencia >=85;
        boolean Pro_medio= promedio >70;


        if ((mayor18 && menorigual25 ) && PROMEDIO && ASISTENCIA )
         System.out.println ("El estudiante califica para la beca");

sc.close();
    }
}
