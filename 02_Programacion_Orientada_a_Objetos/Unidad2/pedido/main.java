import java.util.List;
public class main {
    public static void main (String [] args){
        Cliente c = new Cliente("Jorge");
        Direccion d = new Direccion("Calle 7", "No. 123", "Col. Juan Pablo");
            Producto p1 = new Producto("Laptop", 15995.6);
            Producto p2= new Producto("Mouse", 152.36);
            Producto p3= new Producto("No-break", 1200.6);
            Pedido pedido = new Pedido(c, d, List.of(p1,p2));

            pedido.agregarProducto(p3);
            System.out.println("Cliente: " + pedido.getNombreCte().getNombre());
            System.out.println("Direccion: " + pedido.getDireccion().getCalle() + " " + pedido.getDireccion().getNumero() + " " + pedido.getDireccion().getColonia());
         System.out.println("Total productos: " + pedido.getTotalProductos());

        }
        
}
