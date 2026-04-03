import java.util.ArrayList;
import java.util.List;

public class Pedido {
    //atributos como objetos
    //asociacion 
    private Cliente cliente;
    //composicion 
    private Direccion direccion;
    //agregacion 
    private List <Producto> productos;

    public Pedido(Cliente cliente, Direccion direccion, List<Producto> productos){
        if (cliente == null) throw new IllegalArgumentException("Cliente es obligatorio");
        if (direccion == null) throw new IllegalArgumentException("Direccion es obligatorio");
        if (productos == null || productos.isEmpty() ) throw new IllegalArgumentException("Pedido debe tener al menos un productos");

        this.cliente = cliente;
        this.direccion= direccion;
        this.productos= new ArrayList<>(productos);
        
    }
    public void agregarProducto(Producto productos){
        //parametro
        if (productos== null) return;
        //atributo por eso el this
        this.productos.add(productos);
    }
    public int getTotalProductos(){
        return productos.size();
    }

    public Cliente getNombreCte(){
            return cliente;

    }
    public Direccion getDireccion(){
            return direccion; 
    }
}
