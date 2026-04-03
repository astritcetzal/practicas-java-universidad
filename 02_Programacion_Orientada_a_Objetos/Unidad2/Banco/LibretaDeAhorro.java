class LibretaDeAhorro extends CuentaBancaria{
    protected double interes;

    public LibretaDeAhorro(int numero, double saldoInicial, double interes){
        super(numero, saldoInicial);
        this.interes = interes;
    }

    public void intereses(){
        System.out.println();
        System.out.println("Actualizando interese en la cuenta: " + numero);
    saldo+=saldo*interes/100.0;
    System.out.println("Saldo tras la actualizacion: " + saldo + "Euros");


}
}
//sin el 