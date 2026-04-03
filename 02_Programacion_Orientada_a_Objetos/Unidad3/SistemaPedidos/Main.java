import java.io.IOException;
import java.util.List;

public class Main {
    public static void main (String [] args){
        try{
            PedidoServicio pedidos = new PedidoServicio("menu.csv");
            
            List <Platillo> menu= List.of( new Platillo("Chilaquiles", 120, "Mexicana"), new Platillo("Mole", 100, "Mexicana"),new Platillo("Poutine", 90, "Canadiense"), new Platillo("Sushi", 120, "Japones"));
            
            for (Platillo plat: menu){
                pedidos.agregarPlatillo(plat);
            }

            pedidos.hacerPedido("Chilaquiles", 2, new DescuentoDosXUno(120));
            pedidos.hacerPedido("Sushi", 1, new DescuentoPorcentaje(5.5));
            pedidos.hacerPedido("Mole", 1, new DescuentoFijo(20));
            pedidos.hacerPedido("Poutine", 1, new SinDescuento());

            System.out.println("========Menu platillos========");
            for (Platillo plat: pedidos.getPlatillos()){
                System.out.println("Platillo: " + plat.getNombre() +  " | Categoria: " + plat.getCategoria() + " | Precio: " + plat.getPrecio());
            }

            System.out.println("\n =========Buscar por Platillos========= ");
            Platillo encontrado  = pedidos.buscarPlatillo("Chilaquiles");
            if (encontrado != null){
                     System.out.println(" Encontrado: " + encontrado.getNombre() +  " | Categoria: " + encontrado.getCategoria()+ " | Precio: " + encontrado.getPrecio());
                }

            System.out.println("\n=========Platillos por categoria=========");
            for (Platillo plat: pedidos.filtrarPorCategoria("Mexicana")){
            System.out.println("Nombre: "+plat.getNombre()+ " | Categoria " + plat.getCategoria()+ " | Precio: "+plat.getPrecio());
        }

            System.out.println("\n=========Total ventas=========");
            System.out.println(pedidos.getTotalDelDia());

            
           
        }
        catch (IllegalArgumentException e){
            System.out.println("Argumentos invalidos por favor asegurese de escribir bien los datos: " +  e.getMessage());
        }
        catch (IOException e){
            System.out.println("Error de archivo: " + e.getMessage());
        }

    }
}
