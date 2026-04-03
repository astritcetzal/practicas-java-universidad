class cuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String estado;

    public cuentaBancaria(){
        this.saldo= 0;
        this.estado= "ACTIVA";
    }
    public cuentaBancaria (String numeroCuenta, double saldoInicial){
        this.numeroCuenta= (numeroCuenta != null && !numeroCuenta.isBlank()) ? numeroCuenta: "Sin cuenta";
        this.saldo= (saldoInicial > 0) ? saldoInicial:0.0;
        this.estado = (saldoInicial > 0) ? "ACTIVA" : "BLOQUEADA" ;
    }

    public void depositar(double monto){
        System.out.println((monto>0)? "Saldo suficiente" : "Saldo insuficiente");
    }
    public boolean retirar(double monto){
        return (monto > 0)? true: false;
    }
}
