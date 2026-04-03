import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator; 
public class VeterinariaServicio{
    private List<Mascota> mascotas;
    private MascotaArchivo archivo;

    public VeterinariaServicio ( String rutaArchivo) throws IOException{
        this.archivo= new MascotaArchivo(rutaArchivo);
        this.mascotas= archivo.cargar();
    }
    public void registrar(Mascota m) throws IllegalArgumentException, IOException{
        for(Mascota mas: mascotas){
            if (mas.getNombre().equals(m.getNombre()) && mas.getEspecie().equals(m.getEspecie())){
                throw new IllegalArgumentException("Ya existe una mascota con el mismo nombre y especie");
            }
        }
        mascotas.add(m);
        archivo.guardar(mascotas);
    }
    
    public List<Mascota> buscarPorEspecie(String especie){
        List <Mascota> buscados = new ArrayList<>();
        for (Mascota mas: mascotas){
            if (mas.getEspecie().equals(especie)){
                buscados.add(mas);
            }
        }
        return buscados;
        
    }
    
    public boolean eliminarPorNombre(String nombre){
       Iterator<Mascota> it = mascotas.iterator();
       while (it.hasNext()){
            Mascota mas = it.next();
            if (mas.getNombre().equals(nombre)){
                it.remove();
                archivo.guardar(mascotas);
                return true;
            }
        } return false;
    }

    public List<Mascota> getMascotas(){
        return mascotas; 
    }
}

