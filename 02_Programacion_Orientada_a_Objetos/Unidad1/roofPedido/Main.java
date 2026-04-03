public class Main {
    public static void main (String [] args){
        PedidoRoof p1= new PedidoRoof();
        PedidoRoof p2= new PedidoRoof("Pechuga a plancha", 1, 120 );
        PedidoRoof p3= new PedidoRoof("Fideos", 3, 320.75 );
        PedidoRoof p4= new PedidoRoof("Sopa", 1, 90.5 );
        
        p1.entregar();
        p2.marcarListo();
        p3.marcarListo();
        p4.entregar();

        System.out.println("Total de pedidos: "+ PedidoRoof.getTotalPedidos());
    }

}
