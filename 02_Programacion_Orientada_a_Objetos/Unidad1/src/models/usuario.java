class usuario{
    private  String nombre;
    private double saldo;
    static int totalUsuarios=0; 
    
    public usuario (String nombre, double saldo) {
        this.nombre=nombre; 
        this.saldo=saldo;
        totalUsuarios++;
    }
    public String getnombre(){
        return nombre;
    }
    public double getsaldo(){
        return saldo;
    }
}

