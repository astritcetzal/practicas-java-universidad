public class Tienda {
    public void vender(String producto, int cantidad){
        try {
            if (producto == null){
                throw new NullPointerException("Producto no válido");
            }
            if (cantidad <= 0){
                throw new ArithmeticException("Cantidad no válida");
            }
            System.out.println("Venta realizada: " + cantidad + "x" + producto);
        }catch (NullPointerException e ){
            System.out.println("El producto no es valido");
        }catch (ArithmeticException e ){
            System.out.println("La cantidad no es suficiente");
        }
    }
}