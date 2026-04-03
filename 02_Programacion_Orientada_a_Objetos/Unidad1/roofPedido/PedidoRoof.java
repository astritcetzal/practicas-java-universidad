public class PedidoRoof {

    // Atributos de instancia
    private String producto;
    private int cantidad;
    private double total;
    private String estado;

    // Atributo estático
    private static int totalPedidos=0;
    // Constructor default
    public PedidoRoof() {
        // COMPLETAR: asigna valores por defecto y aumenta totalPedidos
        //// valores por defecto: "Sin producto", 1, 0, estado "pendiente"
        this.producto = "Sin producto";
        this.cantidad=0;
        this.total= 0;
        this.estado="Pendiente";
        totalPedidos++;
    }

    // Constructor parametrizado
    public PedidoRoof(String producto, int cantidad, double total) {
        // COMPLETAR: asigna parámetros, agrega estado "confirmado" y aumenta totalPedidos
        this.producto=(producto != null && !producto.isBlank()) ? producto : "Sin productos";
        this.cantidad=cantidad;
        this.total=total;
        this.estado="Confirmado";
        totalPedidos++;
    }

    // Método de instancia
    public void marcarListo() {
        // COMPLETAR: estado = "listo"
        this.estado="listo";
    }

    // Método de instancia
    public void entregar() {
        // COMPLETAR: estado = "entregado"
        this.estado="Entregado";
    }

    public static int getTotalPedidos() {
        // COMPLETAR: regresa totalPedidos
        return totalPedidos;
    }
}
