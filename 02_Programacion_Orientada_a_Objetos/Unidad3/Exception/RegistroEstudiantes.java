import java.util.ArrayList;
import java.util.List;
public class RegistroEstudiantes {
    private List<String> matriculas = new ArrayList<>();
    private static final int LIMITE=2;

    public void registrar(String nombre, String matricula) throws MatriculaDuplicadaException, GrupoLlenoException{
        if (nombre == null || nombre.isEmpty()){
            throw new IllegalArgumentException("Nombre vacio"); 
        }

        if (matriculas.size()>=LIMITE){
            throw new GrupoLlenoException("No se puede registrar a "+nombre, LIMITE, matriculas.size());
        }

        if (matriculas.contains(matricula)) throw new MatriculaDuplicadaException(matricula);
        
        matriculas.add(matricula);
        System.out.println("Registrado: " + nombre);

    }
}
