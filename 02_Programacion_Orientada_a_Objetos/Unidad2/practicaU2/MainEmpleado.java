/*
MAINEMPLEADO: Revisa y corrige:
    - Que las instancias usen los tipos correctos (double/int) según los constructores.
    - Que el programa NO se detenga al intentar retirar más saldo del disponible.
    - Que el polimorfismo funcione: Empleado como referencia y objetos hijo como instancia.
*/
import java.util.Scanner;
public class MainEmpleado {
    public static void main(String[] args) {

        Empleado e1 = new EmpleadoTiempoCompleto("Gio", 5000, 500);
        Empleado e2 = new EmpleadoPorHoras("Rodrigo", 200, 40);

        System.out.println(e1.getDescripcion());
        System.out.println("Salario: " + e1.calcularSalario());

        System.out.println(e2.getDescripcion());
        System.out.println("Salario: " + e2.calcularSalario());

        CuentaBancaria cuenta = new CuentaBancaria(123, 100);
        cuenta.retirar(150);
        CuentaBancaria cuenta1 = new CuentaBancaria(124, 1000);
        cuenta1.retirar(150);
        CuentaBancaria cuenta2 = new CuentaBancaria(102, 1000);
        cuenta2.retirar(100);

        System.out.println("Fin del programa.");
    }
}

/*
EMPLEADO: Revisa y corrige:
    - Encapsulamiento: ¿la visibilidad de 'nombre' permite que las clases hijas generen descripciones?
    - Tipos de datos: salarioBase debe ser consistente con cálculos (double vs int).
    - Constructor: nombre del constructor debe coincidir exactamente con la clase y parámetros con atributos.
    - Método calcularSalario(): debe retornar un double.
*/
class Empleado {
    
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public String getDescripcion() {
        return "Empleado: " + nombre + " Base:$" + salarioBase;
    }
}

/*
EMPLEADOTIEMPOCOMPLETO: Revisa y corrige:
    - Constructor: debe llamar a super(...) para inicializar nombre y salarioBase.
    - Tipos: el salario base debe ser compatible con el de la clase padre.
    - Sobrescritura: calcularSalario() debe sobrescribir correctamente y usar @Override.
    - getDescripcion(): debe sobrescribir el método correcto (mismo nombre y firma).
*/
class EmpleadoTiempoCompleto extends Empleado {
    private double bono;

    public EmpleadoTiempoCompleto(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
        
    }
    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
    
    @Override
    public String getDescripcion() {
        return "Empleado Tiempo Completo: " + nombre + 
                " Base: $" + salarioBase + 
                " Bono: $" + bono;
    }
}

/*
    EMPLEADOPORHORAS: Revisa y corrige:
    - Constructor: el segundo parámetro representa pagoPorHora: debe mapearse correctamente al atributo del padre.
    - Tipos: evitar pérdida de decimales (double).
    - Sobrescritura: calcularSalario() debe usar @Override y calcular con el tipo correcto.
*/

class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;

    public EmpleadoPorHoras(String nombre, double pagoPorHora, int horasTrabajadas) {
        super(nombre, pagoPorHora);
        this.horasTrabajadas = horasTrabajadas;
    }

   @Override
    public double calcularSalario() {
        return salarioBase * horasTrabajadas;
    }
    
    @Override
    public String getDescripcion() {
        return "Empleado Por Horas: " + nombre +
               " | Pago/hora: $" + salarioBase +
               " | Horas: " + horasTrabajadas;
    }
}

/*
CUENTABANCARIA: Revisa y corrige:
    - El método retirar() debe controlar fondos insuficientes SIN lanzar excepción que detenga el programa.
      (Ejemplo: imprimir un mensaje y regresar).
*/

class CuentaBancaria {
    private int numero;
    private double saldo;

    public CuentaBancaria(int numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad inválida");
             return;
        }
       
        if (saldo < cantidad) {
            System.out.println("No hay fondos suficientes. Saldo: " + saldo);
             return;
        }
        saldo -= cantidad;
        System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
    }
}