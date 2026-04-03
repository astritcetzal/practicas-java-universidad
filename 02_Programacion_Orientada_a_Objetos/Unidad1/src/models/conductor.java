class conductor {
    private String nombre;
    static int totalConductores=0;

    public conductor (String nombre){
        this.nombre= nombre;
        totalConductores++;
    }
    public String getnombre() {
        return nombre;
    }
}