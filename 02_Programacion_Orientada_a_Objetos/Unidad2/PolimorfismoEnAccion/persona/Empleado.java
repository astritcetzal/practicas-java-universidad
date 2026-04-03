package persona;

public class Empleado extends Persona{
    private int idEmpleado;
    private static int Count = 0;
    private double sueldo;

    public Empleado(){
        idEmpleado =++ Count; //pendiente REVISA NO SE TE OVIDE
    }

    public Empleado(double sueldo){
        this();
        this.sueldo= sueldo;
    }

    @Override
    public String mostrarDatos(){
        return super.mostrarDatos() + " sueldo: " + sueldo;
    }

    
    public int getIdEmpleado(){
        return idEmpleado;
    }

    public static int getCount(){
        return Count;
    }

    public double getSueldo(){
        return sueldo;
    }

    public void setSueldo(double sueldo){
        this.sueldo = sueldo; 
    }

    @Override
    public String toString(){
        return "Empleado{" + 
                "idEmpleado=" + idEmpleado +
                ", sueldo=" + sueldo +
                ", name='" + name + '\'' +
                ", edad=" + edad + '}';
    }
}
