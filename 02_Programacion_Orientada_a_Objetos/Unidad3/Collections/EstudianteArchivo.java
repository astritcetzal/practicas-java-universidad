//capa 2
import java.io.*; //BufferedReader File, FileReader, FileWriter, OrinWriter si son mas de cinco e puedo el io.*;
import java.util.ArrayList;
import java.util.List;

public class EstudianteArchivo implements RepositorioEstudiante {
    private String rutaArchivo;

    public EstudianteArchivo(String rutaArchivo){
        this.rutaArchivo= rutaArchivo;
    }
    @Override 
    //printWriter + filewriter con try-with-resource
    public void guardar(List<Estudiante> estudiantes)throws IOException{
        try (PrintWriter pw = new PrintWriter(new FileWriter(rutaArchivo))){
            pw.println ("nombre,matricula,calificaciones");           
             for (Estudiante est : estudiantes){
                pw.println(est.toCSV());
            }
        }
    } //se cierra automaticamente tema 1: try with -resource

    //BUfferedREADER + fileREADER CON TWR + file.exists()
    @Override
    public List<Estudiante> cargar() throws IOException{
        List<Estudiante> estudiantes = new ArrayList<>();

        File archivo = new File(rutaArchivo);
        if (!archivo.exists()){
            return estudiantes; //primera ejecucion, lista vacia 
        }
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))){
            String linea;
            boolean primeraLinea = true; //bandera
            while ((linea=br.readLine()) != null){
                if (primeraLinea){
                    primeraLinea = false;
                    continue;
                }
                if (!linea.trim().isEmpty()){
                    try{
                        estudiantes.add(Estudiante.fromCSV(linea)); //tema 3
                    }catch(IllegalArgumentException e){ //tema 1
                        System.out.println("Linea ignorada: " +e.getMessage());
                    }
                }
            }
        }

        return estudiantes;
    }

    
}
