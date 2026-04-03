package test;

import persona.Persona;
import persona.Empleado;
public class testPersona {
    public static void main (String [] args){
        Persona empleado = new Empleado(500);
        empleado.setName("Fredys");
        empleado.setEdad(30);
        polimosfirmo(empleado);

    }
    private static void polimosfirmo(Persona persona){
        String datos= persona.mostrarDatos();
        System.out.println(datos);

    }
}
