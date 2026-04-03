import java.io.IOException;
public class Main {
    public static void main (String[] args){
    try{
    VeterinariaServicio veterinaria= new VeterinariaServicio("mascotas.csv");
    System.out.println("Estudiantes cargados: " + veterinaria.getMascotas().size());

    Mascota mas1= new Mascota("Nina", "Perro", 1, 15.2);
    Mascota mas2= new Mascota("Tito", "Perro", 8, 25.2);
    Mascota mas3= new Mascota("Milo", "Gato", 4, 15.2);
    Mascota mas4= new Mascota("Fida", "Tortuga", 5, 1.2);

    veterinaria.registrar(mas1);
    veterinaria.registrar(mas2);
    veterinaria.registrar(mas3);
    veterinaria.registrar(mas4);

    System.out.println("\n Buscar por Especie ");
        for (Mascota mas: veterinaria.buscarPorEspecie("Perro")){
            System.out.println("Nombre: " + mas.getNombre()+ " | Especie: " + mas.getEspecie());
        }

    System.out.println("\nEliminar mascotas");
        System.out.println("¿Se eliminó alguna mascota? "+veterinaria.eliminarPorNombre("Milo"));
        
   
    }
        catch (IllegalArgumentException e){
            System.out.println("Argumentos invalidos por favor asegurese de escribir bien los datos: " +  e.getMessage());
        }
        catch (IOException e){
            System.out.println("Error de archivo: " + e.getMessage());
        }
}
}
