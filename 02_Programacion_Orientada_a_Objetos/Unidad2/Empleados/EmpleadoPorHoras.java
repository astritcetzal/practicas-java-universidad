class EmpleadoPorHoras extends Empleado{
    private int  horasTrabajadas;
    public EmpleadoPorHoras(String nombre, double salarioBase, int horasTrabajadas){
        super(nombre, salarioBase);
        if (horasTrabajadas < 0) throw new IllegalArgumentException("Las horas trabajadas no pueden ser menor a 0");
        this.horasTrabajadas= horasTrabajadas;
    }
    // Sobrescritura
    @Override
    public double calcularSalario() {
        return this.salarioBase * this.horasTrabajadas;
    }

} 


