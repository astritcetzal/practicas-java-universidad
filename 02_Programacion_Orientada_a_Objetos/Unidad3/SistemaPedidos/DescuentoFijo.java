 public class DescuentoFijo implements EstrategiaDescuento {

    private double montoFijo;

    public DescuentoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    @Override
    public double calcularDescuento(double subtotal, int cantidad) {
        return Math.min(montoFijo, subtotal);
    }

}
