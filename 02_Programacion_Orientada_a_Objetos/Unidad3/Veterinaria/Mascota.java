public class Mascota {

    private String  nombre, especie;
    private int edad;
    private double peso;

    public Mascota(String nombre, String especie, int edad, double peso){
        if(nombre.isEmpty()){ throw new IllegalArgumentException("El nombre no puede estar vacío"); }
        if(especie.isEmpty()){ throw new IllegalArgumentException("No puedede no pertenecer a una especie o estar vacío el apartado|"); }
        if(edad <= 0) { throw new IllegalArgumentException(" La edad no puede ser menor que 0");}
        if (peso <= 0.0) { throw new IllegalArgumentException("El peso tiene que ser mayor que 0.0"); }

        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad; 
        this.peso = peso;
    }

    //NOMBRRE
    public String getNombre(){ return nombre;}
    public void setNombre(String nombre){ this.nombre = nombre; }
    //ESPECIE
    public String getEspecie(){ return especie; }
    public void setEspecie(String especie){ this.especie = especie; }
    //EDAD
    public int getEdad(){ return edad; }
    public void setEdad(int edad){ this.edad = edad; }
    //PESO 
    public double getPeso(){ return peso; }
    public void setPeso(double peso){ this.peso = peso; }

    //toCSV() SERIALIZACIÓN
    public String toCSV() { 
        StringBuilder sb = new StringBuilder();
        sb.append(nombre).append(",").append(especie).append(",").append(edad).append(",").append(peso);
        return sb.toString();
    }

    // DESERIALIZACIÓN 
    public static Mascota fromCSV(String linea) {
        String[] partes = linea.split(",");
        
        if (partes.length != 4) { throw new IllegalArgumentException("Línea inválida, se esperan 4 campos. Actuales: " + linea); }

        try {
            int edadParseada = Integer.parseInt(partes[2].trim());
            double pesoParseado = Double.parseDouble(partes[3].trim());
            return new Mascota(partes[0].trim(), partes[1].trim(), edadParseada, pesoParseado);      
        } catch (NumberFormatException e) {
            System.out.println("Error al leer los datos de mascota: " + e.getMessage());
            throw new IllegalArgumentException("El formato no es válido.");
        }
    }  
}
