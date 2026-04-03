import java.util.List;
import java.util.ArrayList;
public class Estudiante {
    private String nombre;
    private String matricula;
    private List<Integer> calificaciones; //T2: Coleccion generica

    //Constructor con validacion (tema 1: throwss)
    public Estudiante(String nombre, String matricula){
        if (nombre == null || nombre.isEmpty())throw   new IllegalArgumentException("El nombre no puede estar vacio");
        if (matricula == null || nombre.isEmpty())throw   new IllegalArgumentException("La matricula no puede estar vacia");
        this.nombre = nombre;
        this.matricula = matricula;
        this.calificaciones = new ArrayList<>(); // Team 2: arraylist
    }

    //Metodos de negocio (tema 2 colecciones)
    public void agregarCalificacion(int cal){
        if (cal < 0 || cal>100){
            throw new IllegalArgumentException("Calificaciones fuera de rango: " + cal);
        }
        calificaciones.add(cal); // Tena 2: autboxing (de primitivo a objeto ) int -> integer 
    }

    public double getPromedio(){
        if (calificaciones.isEmpty()){
            return 0;
        }
        int suma=0;
        for (int cal: calificaciones){ //Tema 2: for-each + unboxing(de objeto a tipo de dato primitivo)
            suma +=cal;
        }
        return (double) suma / calificaciones.size();
    }

    public String getNombre(){
        return nombre;
    }

    public String getMatricula(){
        return matricula;
    }

    public List<Integer> getCalificaciones(){
        return calificaciones;
    }

    //Serializacion (Tema 3: persistencia)
    //convierte el objeto a una linea 
    public String toCSV(){
        StringBuilder sb= new StringBuilder(); //Tema 3: es mutable
        sb.append(nombre).append(",").append(matricula);
        for (int cal : calificaciones){
            sb.append(",").append(cal);
        }
        return sb.toString();
    }

    //Reconstruye un estudiante desde una linea de csv
    public static Estudiante fromCSV(String linea){
        String[] partes = linea.split(","); //tema 3
        if(partes.length<2){
            throw new IllegalArgumentException("Linea invalida, se esperan al menos 2 campos: " + linea);
        }
        Estudiante est = new Estudiante(partes[0], partes[1]);

        for (int i = 2; i <partes.length; i++){
            try{
                est.agregarCalificacion(Integer.parseInt(partes[i])); //tema 3: parseint
            } catch(NumberFormatException e){ 
                System.out.println("Calificacioón inválida ignorada: " + partes[i]);
            }
        }
        return est;
    }


}