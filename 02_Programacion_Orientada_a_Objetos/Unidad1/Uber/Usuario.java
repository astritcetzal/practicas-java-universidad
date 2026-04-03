class Usuario {
    private String nombre;
    private double saldo;

    static int totalUsuarios=0;

    public Usuario(String nombre, double saldo){
        this.nombre = nombre;
        this.saldo = saldo;
        totalUsuarios++;
    }

    public String getNombre(){
        return nombre;
    }

    public double getSaldo(){
        return saldo;
    }
}
