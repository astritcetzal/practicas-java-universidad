class CuentaCorriente extends CuentaBancaria{
    private LibretaDeAhorro cuentaAsociada;

    public CuentaCorriente(int numero, double saldoInicial, LibretaDeAhorro libreta){
        super(numero, saldoInicial);
        cuentaAsociada= libreta;

    }
    public void retirar (double cantidad){
        System.out.println();
        System.out.println("Retirada de fondos de la cuenta: " + numero);

        System.out.println("Cantidad solicitada: " + cantidad +"Euros");
        if (saldo < cantidad)
            if (cuentaAsociada.getSaldo()< (cantidad - saldo) )
                System.out.println("Ni hay fondos suficientes");
            else {
                System.out.println("Retirando fondos adicionales" + " de la cuenta asocida");
                cuentaAsociada.retirar(cantidad-saldo);
                saldo  = 0.0;
                System.out.println("Saldo actual cuenta corriente: " + "0.0 Euros");
            }
        else {
            saldo -= cantidad;
            System.out.println("Saldo actual: " + saldo + "Euros");
        }
    }
}
