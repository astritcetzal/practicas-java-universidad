/* 
   MAIN: Debes corregir
    - Polimorfismo: las variables deben ser de tipo Figura y apuntar a objetos hijos,
      asegúrate de que los métodos llamados realmente existan en Figura y se sobrescriban en hijas.
    - Relaciones: verifica que Circulo y Rectangulo sí hereden (extends) de Figura y que sus constructores funcionen.
    - El código debe compilar y mostrar la salida esperada tras corregir sobrescritura.
*/
public class MainFigura {
    public static void main(String[] args) {

        Figura f1 = new Circulo(3);
        Figura f2 = new Rectangulo(4, 2);

        System.out.println(f1.descripcion());
        System.out.println("Área: " + f1.area());

        System.out.println(f2.descripcion());
        System.out.println("Área: " + f2.area());
    }
}

/* 
    FIGURA: Debes corregir
        - Herencia/Relación: Figura es la clase base. Las hijas deben extenderla.
        - Polimorfismo: los métodos que se usarán polimórficamente deben estar aquí con firmas correctas.
        - Sobrescritura: si quieres forzar que las hijas implementen, area() y descripcion() deberían ser abstract,
          pero al menos deben existir con la firma exacta que las hijas sobrescribirán.
        - Revisa el constructor: debe permitir inicializar nombre correctamente.
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
    CIRCULO: Debes corregir
        - Herencia/Relación: debe EXTENDER Figura (revisar si falta o está mal escrito).
        - Constructor: debe llamar a super("Círculo") con constructor válido.
        - Sobrescritura: area() debe sobrescribir EXACTAMENTE la firma de Figura (sin parámetros extra).
        - Sobrescritura: descripcion() debe llamarse igual (minúsculas) y misma firma.
*/
class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        super("Circulo"); 
        this.radio = radio;
    }


    public double area() { 
        return Math.PI * radio * radio;
    }
    

    public String descripcion() { 
        return "Círculo de radio " + radio;
    }
}

/*
    RECTÁNGULO: Debes corregir
        - Herencia/Relación: debe extender Figura (y ser coherente con el constructor del padre).
        - Sobrescritura: area() debe tener el mismo tipo de retorno que en Figura (double).
        - Sobrescritura: descripcion() debe tener la firma exacta (sin parámetro).
*/
class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        super("Rectángulo");
        this.base = base;
        this.altura = altura;
    }
    
    public double area() { 
        return base * altura;
    }

    public String descripcion() { 
        return "Rectángulo " + base + " x " + altura;
    }
}

/*
SALIDA ESPERADA DESPUÉS DE CORREGIR (aprox):
Círculo de radio 3.0
Área: 28.274333882308138
Rectángulo 4.0x2.0
Área: 8.0
*/