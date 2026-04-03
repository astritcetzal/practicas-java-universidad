public class Mian {
    public static void main(String[] args){
        Grupo grupo2D = new Grupo("2D");
       

        try{
            Estudiante hugo = new Estudiante("Hugo", "SW2509101");
            hugo.agregarCalificacion(90);
            hugo.agregarCalificacion(85);
            hugo.agregarCalificacion(100);

            Estudiante paco = new Estudiante("Paco", "SW2509102");

            paco.agregarCalificacion(60);
            paco.agregarCalificacion(55);
            paco.agregarCalificacion(65);

            Estudiante luis = new Estudiante("Luis", "SW2509103");

            luis.agregarCalificacion(80);
            luis.agregarCalificacion(75);
            luis.agregarCalificacion(90);

            grupo2D.inscribir(hugo);
            grupo2D.inscribir(paco);
            grupo2D.inscribir(luis);
        

        }
        catch (MatriculaDuplicadaException e){
            System.out.println(e.getMessage());
        } 
        
        //busqueda
        Estudiante encontrado= grupo2D.buscarPorMatricula("SW2509101");
        if(encontrado != null){
            System.out.println("Encontrado" + encontrado.getNombre()+ " - Promedio: " + encontrado.getPromedio());
        }

        System.out.println("\n ---Aprobados---");
        for (Estudiante est: grupo2D.getAprobados()){
            System.out.println(est.getNombre()+ ": " + est.getPromedio());}
        System.out.println("\n --Reprobados--");
        for(Estudiante est : grupo2D.getReprobados()){
            System.out.println(est.getNombre() + ": "+ est.getPromedio());
        }
         // Eliminación segura con Iterator
        System.out.println("\n--- Dando de baja reprobados ---");
        grupo2D.darDeBajaReprobados();

        System.out.println("\n--- Estudiantes restantes ---");
        for (Estudiante est : grupo2D.getEstudiantes()) {
        System.out.println(est.getNombre() + ": " + est.getPromedio());
    }
        
}
}





