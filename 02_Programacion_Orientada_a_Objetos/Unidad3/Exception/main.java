public class main {
    public static void main (String [] args){
        RegistroEstudiantes registro = new RegistroEstudiantes();
        try{
            registro.registrar("Yisus", "SW2509053");
            registro.registrar("Jaoko","SW2509057");
            //registro.registrar("Duplicado", "SW2509053");
            registro.registrar("Carlos", "SW2508003");
        }catch (MatriculaDuplicadaException e){
            System.out.println(e.getMessage());
        }catch (GrupoLlenoException e){
            System.out.println("Errork" + e.getMessage());
            System.out.println("Capacidad" + e.getCapacidadMaxima());
            System.out.println("Actuales" + e.getEstudiantesActuales());
        }
    }
}
