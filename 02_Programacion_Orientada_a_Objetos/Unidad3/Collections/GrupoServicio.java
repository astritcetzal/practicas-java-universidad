import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

//capa de servicio
public class GrupoServicio {
    private RepositorioEstudiante repositorio; //depende de la interfaz
    private List<Estudiante> estudiantes; //tema 4: depende de la interfza

    //constructor carga datos al iniciar (tema 3 + 4)
    public GrupoServicio (RepositorioEstudiante repositorio)throws IOException{
        this.repositorio= repositorio ; //tema 4 composicion (agregacion)
        this.estudiantes = repositorio.cargar(); //tema 4: delegacion
    }

    //inscribir (Tema 1, 2 y 3)
    public void inscribir (Estudiante e ) throws MatriculaDuplicadaException, IOException{
        for (Estudiante est: estudiantes){ //tema 2: for each
            if (est.getMatricula().equals(e.getMatricula())){
                throw new MatriculaDuplicadaException(e.getMatricula());
            }
        }
        estudiantes.add(e); //tema 2 agregar a la coleccion
        repositorio.guardar(estudiantes); // tema 3 + 4 persistir (delegacion)
        
    }
    //Busqueda tema 2
    public Estudiante buscarPorMatricula(String mat){
        for (Estudiante est: estudiantes){
            if (est.getMatricula().equals(mat)){
                return est;
            }
        }
        return null;//no encontrado
    }
    //filtrado: obtener estudiantes aprobados | tema 2
    public List<Estudiante> getAprobados(){
        List<Estudiante> aprobados= new ArrayList<>(); //tema 2: nueva lista
        for (Estudiante est: estudiantes){
            if (est.getPromedio() >= 70){
                aprobados.add(est);//tema 2: filtrado
            }
        }

        return aprobados;
    }
    //filtrado: obtener estudiantes reprobados
    public List<Estudiante> getReprobados(){
        List <Estudiante> reprobados = new ArrayList<>();
        for (Estudiante est: estudiantes){
            if (est.getPromedio()< 70){
                reprobados.add(est);
            }
        }
        return reprobados;
    }
    //tema 2: iterator
    public void darDeBajaReprobados() throws IOException{
        Iterator<Estudiante> it = estudiantes.iterator();

        while (it.hasNext()){
            Estudiante est = it.next();
            if (est.getPromedio() < 70){
                System.out.println("Baja: " + est.getNombre()+ " (Promedio: " + est.getPromedio() + ")");
                it.remove();
            }
        }
        repositorio.guardar(estudiantes);
    }
  
    public List <Estudiante> getEstudiantes(){return estudiantes;}


}
