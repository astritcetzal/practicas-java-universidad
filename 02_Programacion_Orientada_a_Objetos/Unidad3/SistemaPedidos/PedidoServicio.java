import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
public class PedidoServicio {
    private List<Platillo> platillos;
    private PlatilloArchivo archivo;
    private double totalDelDia;

    public PedidoServicio(String rutaArchivo)throws IOException{
        this.archivo = new PlatilloArchivo(rutaArchivo);
        this.platillos = archivo.cargar();
    }

    public void agregarPlatillo(Platillo p)throws IOException{
        for (Platillo plat: platillos){
            if (plat.getNombre().equals(p.getNombre())){
                throw new IllegalArgumentException ("Ya existe un platillo con el mismo nombre");
            }
        }
        platillos.add(p);
        archivo.guardar(platillos);
    }

    public Platillo buscarPlatillo(String nombre){
        for (Platillo plat: platillos){
            if (plat.getNombre().equals(nombre)){
                return plat;
            }
        }
        return null;
    }
    public  double hacerPedido(String nombre, int cantidad, EstrategiaDescuento descuento){
        Platillo platilloEncontrado = buscarPlatillo(nombre);
        if (platilloEncontrado == null){
            throw new IllegalArgumentException("No se encontró el platillo");
        }
        double precio = platilloEncontrado.getPrecio();
        double subtotal= precio * cantidad;
        double dEscuento = descuento.calcularDescuento(subtotal, cantidad);
        double total =  subtotal - dEscuento;
        totalDelDia += total;
        
        return total;
    }

    public List<Platillo> filtrarPorCategoria (String categoria){
        List<Platillo> buscados= new ArrayList<>();
        for (Platillo cat: platillos){
            if (cat.getCategoria().equals(categoria)){
                buscados.add(cat);
            }
        }
        return buscados;
    }
    
    public double getTotalDelDia(){
        return totalDelDia;   }

    public List<Platillo> getPlatillos(){return platillos;}
}