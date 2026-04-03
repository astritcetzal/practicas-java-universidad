class Cliente {
    private String nombre;
    private String curp;
    private String telefono;

    public Cliente(){
        this.nombre   = "None";
        this.curp     = "0000000000000000";
        this.telefono = "0000000000";
    }

    public Cliente(String nombre, String curp, String telefono){
        this.nombre   = nombre;
        this.curp     = curp;
        this.telefono = telefono;
    }

    public String obtenerResumen(){
            return "Nombre: " + nombre + "\n" + 
                    "CURP: " + curp + "\n" + 
                    "Telefono: " + telefono;
    }
}