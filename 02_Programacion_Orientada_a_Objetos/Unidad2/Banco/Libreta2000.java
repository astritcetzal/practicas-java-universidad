class Libreta2000 extends LibretaDeAhorro {
    private double penalizacion;
    public Libreta2000(int numero, double saldoInicial, double interes, double penalizacion){
        super(numero, saldoInicial, interes);
        this.penalizacion= penalizacion;
    }

    public void retirar (double cantidad){
        System.out.println();
        System.out.println("Retirando fondos con penalizacion del "+ penalizacion + "% de la cuenta: " + numero);
        System.out.println("Cantidad solicitada: "  + cantidad + "Euros");

        if(saldo < cantidad) System.out.println("No hay fi¿ondos suficientes");
        else {
            saldo -= cantidad * (1.0-penalizacion/100.0);
            System.out.println("Saldo actual: " + saldo + "Euros");
        }
    }


}
