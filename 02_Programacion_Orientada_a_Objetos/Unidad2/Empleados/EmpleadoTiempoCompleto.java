class EmpleadoTiempoCompleto extends Empleado{
    private double bono;

    public EmpleadoTiempoCompleto(String nombre, double salarioBase, double bono){
        super(nombre, salarioBase);
        if (bono < 0) throw new IllegalArgumentException("El bono no puede ser menor a 0");
        this.bono= bono;
    }

    // Sobrescritura
    @Override
    public double calcularSalario(){
        return this.salarioBase+this.bono;
    }
}

