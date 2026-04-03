class Empleado{
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase){
        if (nombre.isEmpty() || nombre ==null) throw new IllegalArgumentException("Nombre es obligatorio");
        if (salarioBase < 0) throw new IllegalArgumentException("El salario no puede ser menor a 0");
        this.nombre= nombre;
        this.salarioBase= salarioBase;
    }
    public double calcularSalario(){
        return this.salarioBase;
    }
 
    public void getDescripcion(){

        System.out.println("=========Detalles========");
        System.out.println("El salario de " + nombre + " es: " + this.calcularSalario());
}

}

