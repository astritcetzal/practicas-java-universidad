class Conductor {
    private String nombre;
    
    static int totalConductores=0;

    public Conductor(String nombre){
        this.nombre = nombre;
        totalConductores++;
    }

    public String getNombre(){
        return nombre;
    }
}
