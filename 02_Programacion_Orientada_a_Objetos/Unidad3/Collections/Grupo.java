import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class Grupo {
    private String nombre;
    private List<Estudiante> estudiantes;

    public Grupo (String nombre){
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public void inscribir (Estudiante e ) throws MatriculaDuplicadaException{
        for (Estudiante est: estudiantes){
            if (est.getMatricula().equals(e.getMatricula())){
                throw new MatriculaDuplicadaException(e.getMatricula());
            }
        }
        estudiantes.add(e);
    }
    //Busqueda
    public Estudiante buscarPorMatricula(String mat){
        for (Estudiante est: estudiantes){
            if (est.getMatricula().equals(mat)){
                return est;
            }
        }
        return null;//no encontrado
    }
    //filtrado: obtener estudiantes aprobados
    public List<Estudiante> getAprobados(){
        List<Estudiante> aprobados= new ArrayList<>();
        for (Estudiante est: estudiantes){
            if (est.getPromedio() >= 70){
                aprobados.add(est);
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
    public void darDeBajaReprobados(){
        Iterator<Estudiante> it = estudiantes.iterator();

        while (it.hasNext()){
            Estudiante est = it.next();
            if (est.getPromedio() < 70){
                System.out.println("Baja: " + est.getNombre()+ " (Promedio: " + est.getPromedio() + ")");
                it.remove();
            }
        }
    }
  
    public List <Estudiante> getEstudiantes(){ return estudiantes;}

    public String getNombre(){return nombre;}


}
