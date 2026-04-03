import java.util.InputMismatchException;
import java.util.Scanner;
/*
MAIN: Revisa y corrige:
    - Que se cree y ejecute correctamente el menú.
*/
public class MainFiguraPro {
    public static void main(String[] args) {
        new Menu().ejecutar();
    }
}

/*
MENU: Revisa y corrige:
    - Debe usar leerEntero(sc) para leer la opción.
    - Debe declarar la variable como Figura (polimorfismo).
    - Debe llamar a crearFigura(opcion, sc).
    - Tipo de variables y asignaciones correctas.
    - Parámetros correctos en la creación de objetos
*/
class Menu {
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ FIGURAS (Polimorfismo) ===");
            System.out.println("1) Círculo");
            System.out.println("2) Rectángulo");
            System.out.println("3) Triángulo");
            System.out.println("4) Salir");
            System.out.print("Elige una opción: ");

            opcion = leerEntero(sc);
            
            Figura figura = crearFigura(opcion, sc);

            if (figura != null) {
                System.out.println();
                System.out.println(figura.descripcion());
                System.out.println("Área: " + figura.area()); 
            }
        } while (opcion != 4);

        sc.close();
    }
    //Error
    private Figura crearFigura(int opcion, Scanner sc) {
        switch (opcion) {

            case 1:
                System.out.print("Ingrese el radio del círculo: ");
                double radio = leerDouble(sc);
                return new Circulo(radio);

            case 2:
                System.out.print("Ingrese la base del rectángulo: ");
                double base = leerDouble(sc);
                System.out.print("Ingrese la altura del rectángulo: ");
                double altura = leerDouble(sc);
                return new Rectangulo(base, altura);

            case 3:
                System.out.print("Ingrese la base del triángulo: ");
                double baseT = leerDouble(sc);
                System.out.print("Ingrese la altura del triángulo: ");
                double alturaT = leerDouble(sc);
                return new Triangulo(baseT, alturaT);

            case 4:
                System.out.println("Saliendo del programa...");
                return null;

            default:
                System.out.println("Opción inválida.");
                return null;
        }
    }

    private int leerEntero(Scanner sc) {
        while(true){
            try { 
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Ingresa un número entero.");
                sc.next(); 
            }
        }
    }

    private double leerDouble(Scanner sc) {
        while (true) {
            try {
                double valor = sc.nextDouble();
                if (valor > 0) return valor;
                System.out.println("El valor debe ser mayor que 0.");
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Ingresa un número válido.");
                sc.next();
            }
        }
    }
}

/*
    FIGURA: Revisa y corrige:
    - Encapsulamiento.
    - Parámetros constructor.
    - area() y descripcion() deben ser abstract.
*/
abstract class Figura {

    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }


    public abstract double area();

    public abstract String descripcion();
}

/*
CIRCULO: Revisa y corrige:
    - Debe extender Figura.
    - radio debe ser constante.
    - Constructor debe recibir double radio.
    - area() y descripcion() deben sobrescribir con @Override.
*/
class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        super("Círculo");
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
    @Override
    public String descripcion() {
        return nombre + " de radio: " + radio;
    }
}

/*
RECTANGULO: Revisa y corrige:
    - Encapsulamiento
    - base y altura deben ser constante.
    - Constructor debe llamar constructor padre.
    - area() y descripcion() con @Override y misma firma.
*/
class Rectangulo extends Figura {

    private final double base;
    private final double altura;

    public Rectangulo(double base, double altura) {
        super("Rectangulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public String descripcion() {
        return nombre + " de base " + base + " y altura " + altura;
    }
}

/*
TRIANGULO: Revisa y corrige:
    - base y altura deben ser constante.
    - Atributos correctos y asignación en el constructor.
    - area() y descripcion() con @Override y firma correcta.
*/
class Triangulo extends Figura {

    private double base;
    private final double altura;

    public Triangulo(double base, double altura) {
        super("Triángulo");
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double area() {
        return (base * altura) / 2;
    }

    @Override
    public String descripcion() {
        return nombre + " de base " + base + " y altura " + altura;
    }
}