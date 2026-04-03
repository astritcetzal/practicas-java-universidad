import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try{
            //tema 4: crear implementacio y pasarla al servico
            RepositorioEstudiante repositorio = new EstudianteArchivo("grupo2D.csv");
            GrupoServicio grupo = new GrupoServicio(repositorio);
            System.out.println("Estudiantes cargados: " + grupo.getEstudiantes().size());

            Estudiante hugo = new Estudiante("Hugo", "SW2509101");
            hugo.agregarCalificacion(90);
            hugo.agregarCalificacion(85);
            hugo.agregarCalificacion(100);
            grupo.inscribir(hugo);

            Estudiante paco = new Estudiante("Paco", "SW2509102");

            paco.agregarCalificacion(90);
            paco.agregarCalificacion(85);
            paco.agregarCalificacion(65);
            grupo.inscribir(paco);

            Estudiante luis = new Estudiante("Luis", "SW2509103");

            luis.agregarCalificacion(50);
            luis.agregarCalificacion(75);
            luis.agregarCalificacion(40);
            grupo.inscribir(luis);    
            
        //busqueda
        Estudiante encontrado = grupo.buscarPorMatricula("SW2509101");
        if(encontrado != null){
            System.out.println("Encontrado" + encontrado.getNombre()+ " - Promedio: " + encontrado.getPromedio());
        }

        System.out.println("\n ---Aprobados---");
        for (Estudiante est: grupo.getAprobados()){
            System.out.println(est.getNombre()+ ": " + est.getPromedio());}
        System.out.println("\n --Reprobados--");
        for(Estudiante est : grupo.getReprobados()){
            System.out.println(est.getNombre() + ": "+ est.getPromedio());
        }
         // Eliminación segura con Iterator
        System.out.println("\n--- Dando de baja reprobados ---");
        grupo.darDeBajaReprobados();

        System.out.println("\n--- Estudiantes restantes ---");
        for (Estudiante est : grupo.getEstudiantes()) {
        System.out.println(est.getNombre() + ": " + est.getPromedio());
    }

        Estudiante luisa = new Estudiante("Luisa", "SW2509104");

            luisa.agregarCalificacion(80);
            luisa.agregarCalificacion(75);
            luisa.agregarCalificacion(90);
            grupo.inscribir(luisa);    
            
    }
        catch (MatriculaDuplicadaException e){
            System.out.println("Error: " + e.getMessage());
        } catch(IOException e){
            System.out.println("Error de archivo: " + e.getMessage());
        }
        
}
}