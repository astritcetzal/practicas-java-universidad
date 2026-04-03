public class Banco {
    private static int totalClientes = 0;
    private static int totalCuentas = 0;

    // Métodos

    void registrarCliente(Cliente cliente) {
        totalClientes++;

    }

    void registrarCuenta(CuentaBancaria cuenta) {
        totalCuentas++;
    }

    public static int getTotalClientes() {
        return totalClientes;
    }

    public static int getTotalCuentas() {
        return totalCuentas;
    }

}