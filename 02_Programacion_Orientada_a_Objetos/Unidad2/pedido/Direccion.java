public class Direccion {
    private String calle, numero, colonia;
    public Direccion(String calle, String numero, String colonia){
        this.calle = calle;
        this.numero = numero;
        this.colonia= colonia;
    }

    public String getCalle(){
        return calle;
    }
    public String getNumero(){
        return this.numero;
    }
    public String getColonia(){
        return colonia;
    }
}
