class Main {
    public static void main(String [] args){
        LibretaDeAhorro libreta = new LibretaDeAhorro(12345, 2000, 4 );
        Libreta2000 libreton = new Libreta2000(23456, 2000, 8, 2);
        CuentaCorriente cuenta = new CuentaCorriente(34567, 2000, libreta);
        libreta.retirar(100);
        cuenta.retirar(300);
        libreton.retirar(200);
        libreton.intereses();
    }
}
