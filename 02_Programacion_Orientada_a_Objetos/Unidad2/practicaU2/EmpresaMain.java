/* MAIN:
   - Revisa la creación de objetos y el uso del polimorfismo.
   - ¿Tiene sentido instanciar todas estas clases?
*/
public class EmpresaMain {
    public static void main(String[] args) {
        
        Empleado dev1 = new Desarrollador("Ana", 4000.0, "Java");
        Empleado ger1 = new Gerente("Carlos", 5000.0, 1500.0);

  
        
        System.out.println("Bono Dev: " + dev1.calcularBono());
        System.out.println(ger1.obtenerDetalles()); 
    }
}

/* EMPLEADO:
   - Clase base. Revisa constructores, modificadores de acceso, tipos de retorno y métodos abstractos.
*/
abstract class Empleado {
    protected String nombre; 
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularBono(); 
    
    public String obtenerDetalles() { 
        return "Nombre: " + nombre + ", Salario: " + salarioBase;
    }
}

/* DESARROLLADOR:
   - Revisa cómo se hereda de la clase base y cómo funciona el constructor.
   - ¿Se están implementando correctamente los métodos obligatorios?
*/
class Desarrollador extends Empleado { 
    private String lenguaje;

    public Desarrollador(String nombre, double salarioBase, String lenguaje) {
        super(nombre, salarioBase); 
        this.lenguaje = lenguaje;
    }
    @Override
    public double calcularBono() {
        return salarioBase * 0.10;
    }
}

/* GERENTE:
   - Revisa la herencia, el uso de variables de la clase padre y la sobrescritura de métodos.
*/
class Gerente extends Empleado {
    private double bonoExtra;

    public Gerente(String nombre, double salarioBase, double bonoExtra) {
        super(nombre, salarioBase);
        this.bonoExtra = bonoExtra; 
    }

    @Override
    public double calcularBono() {
        return (salarioBase * 0.20) + bonoExtra;
    }
    @Override
    public String obtenerDetalles() { 
        return super.obtenerDetalles() + ", Bono Extra: " + bonoExtra;
    }
}

/*
SALIDA ESPERADA DESPUÉS DE CORREGIR:
(No debería poderse crear el Empleado base si es abstracto)
Nombre: Ana, Salario: 4000.0
Bono Dev: 400.0
Nombre: Carlos, Salario: 5000.0, Bono Extra: 1500.0
Bono Gerente: 2500.0
*/