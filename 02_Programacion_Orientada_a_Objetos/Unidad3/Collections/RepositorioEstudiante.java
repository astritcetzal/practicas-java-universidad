import java.io.IOException;
import java.util.List;
//INTRFZA
public interface RepositorioEstudiante {
    void guardar (List<Estudiante> estudiantes) throws IOException;
    List <Estudiante> cargar () throws IOException;
}
