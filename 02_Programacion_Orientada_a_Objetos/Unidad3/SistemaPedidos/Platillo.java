public class Platillo {

    private String nombre, categoria;
    private double precio;

    public Platillo(String nombre, double precio, String categoria){
        if(nombre == null || nombre.isEmpty()){ throw new IllegalArgumentException("el nombre no puede estar vacío."); }
        if(precio <= 0){ throw new IllegalArgumentException("El precio no puede ser 0 o menor que 0."); }
        if(categoria == null || categoria.isEmpty()){ throw new IllegalArgumentException("La categoria no puede estar vacío."); }

        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { 
        if(nombre == null || nombre.isEmpty()){ throw new IllegalArgumentException("el nombre no puede estar vacío."); }
        this.nombre = nombre; 
    }

    public String getCategoria() { return categoria; }

    public void setCategoria(String categoria) { this.categoria = categoria; }

    public double getPrecio() { return precio; }

    public void setPrecio(double precio) { 
        if(precio <= 0){ throw new IllegalArgumentException("El precio no puede ser 0 o menor que 0."); }
        this.precio = precio;
    }


    public String toCSV(){
        StringBuilder sb = new StringBuilder();
        sb.append(nombre).append(",").append(precio).append(",").append(categoria);
        return sb.toString();
    }

    public static Platillo fromCSV(String linea) {
        String[] partes = linea.split(", ");  
        if (partes.length != 3) {  throw new IllegalArgumentException("Línea inválida, se esperan 3 campos: " + linea); }
        try {
            String nombre = partes[0].trim();
            double precio = Double.parseDouble(partes[1].trim());
            String categoria = partes[2].trim();
            return new Platillo(nombre, precio, categoria);      
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("El precio en el CSV debe ser un número válido.");
        }
    }

    @Override
    public String toString() { return nombre + " - $" + precio + " (" + categoria + ")"; }
}
