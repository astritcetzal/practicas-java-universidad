class CuentaBancaria{
    protected int numero;
    protected double saldo;
    public CuentaBancaria(int numero, double saldoInicial){
        this.numero = numero;
        saldo= saldoInicial;
    }
    public void depositar (double cantidad){
        System.out.println();
        System.out.println("Deposito en la cuenta: " + cantidad + " Euros");

        saldo += saldo;
        System.out.println("Cantidad depositada: " + saldo + "Euros");

    }

    public void retirar(double cantidad){
        System.out.println();
        System.out.println("Retirada de fondos de la cuenta: " + numero);
        System.out.println("Cantida solicitada: " +  cantidad+"Euros");
    
    if (saldo < cantidad) System.out.println("No hay fondos suficientes");
    else {
        saldo -= cantidad;
        System.out.println("Saldo actual: " + saldo + "Euros");
    }
    }
    public double getSaldo(){
        return saldo;
    }
//no se crea el objeto cuenta banco porque estoy hablando a mis cuentas hijos atreves de la cuenta padre
}