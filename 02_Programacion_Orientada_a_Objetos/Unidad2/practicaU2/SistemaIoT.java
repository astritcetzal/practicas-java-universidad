/* PISTAS:
   1. Revisa qué le falta al archivo en la primera línea para que Scanner exista.
   2. MAIN: Hay un error lógico clásico al leer un número y luego leer un texto. ¿Qué pasa con el "Enter" (\n)?
   3. TERMOSTATO (Constructor): Revisa cómo se están inicializando las variables del padre. ¿Falta algo esencial?
   4. TERMOSTATO (Métodos): Revisa detenidamente el nombre del método obligatorio que se está implementando.
*/

import java.util.Scanner;
public class SistemaIoT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el ID del dispositivo (número): ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingresa la marca del dispositivo:");
        String marca = sc.nextLine();
        
        // Intentamos crear un termostato inteligente
        Dispositivo termostato = new Termostato(id, marca, 25.5);

        termostato.mostrarDatos();
        System.out.println("Estado de red: " + termostato.conectarRed());
        
        sc.close();
    }
}

/* CLASE BASE: DISPOSITIVO */
abstract class Dispositivo {
    protected int id;
    protected String marca;

    public Dispositivo(int id, String marca) {
        this.id = id;
        this.marca = marca;
    }

    public abstract boolean conectarRed();

    public void mostrarDatos() {
        System.out.println("ID: " + id + " - Marca: " +this. marca);
    }
}

/* CLASE HIJA: TERMOSTATO */
class Termostato extends Dispositivo {
    private double temperaturaIdeal;

    public Termostato(int id, String marca, double temperaturaIdeal) {
        super(id, marca);
        this.temperaturaIdeal = temperaturaIdeal;
    }

    @Override
    public boolean conectarRed() {
        System.out.println("Conectando termostato al Wi-Fi...");
        return true;
    }


    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Temperatura configurada: " + temperaturaIdeal + "°C");
    }
}

/*
SALIDA ESPERADA DESPUÉS DE CORREGIR:
Ingresa el ID del dispositivo (número): 101
Ingresa la marca del dispositivo: SmartTemp
ID: 101 - Marca: SmartTemp
Temperatura configurada: 25.5°C
Conectando termostato al Wi-Fi...
Estado de red: true
*/