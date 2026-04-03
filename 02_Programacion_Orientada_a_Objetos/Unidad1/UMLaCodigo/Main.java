public class Main {
    public static void main (String [] args){
        Ticket t1 = new Ticket ("0120360", "8 am", "10 am");
        Ticket t2 = new Ticket ("0120362", "7 am", "12 pm");
        SistemaEstacionamiento n1 = new SistemaEstacionamiento("Paola");
        

       SistemaEstacionamiento.registrarEntradas(v1, e1); //necesita el espacio
       SistemaEstacionamiento.registrarSalidas(e1, t1); //necesita el espacio
       System.out.println(SistemaEstacionamiento.getTotalEntradas());
       System.out.println(SistemaEstacionamiento.getTotalSalidas());
       
    
        
    }
}

/*ESTACIONAMIENTO 
Clase elegida SistemaEstacionamiento
Clase principal: Ticket

Parte 4. Verificación rápida (en 4 líneas)
Responde brevemente:
1. ¿Qué parte fue más directa al convertir UML a Java (atributos, constructores o 
métodos) y por qué?
2. ¿Qué parte te generó más duda y qué hiciste para resolverla?
Escribir los atributos fue lo más directos porque a comparación de los constructores 
y métodos que si me costaron un poco porque tuve que modificar el UML.
 Lo que más me confundió fue un poco la estructura, pero el error principal 
 fue que al momento de crear el UML no verificamos bien para poder escribirlos correctamente. 
 Mi main no corrió y es algo que aun no entiendo porque no funcionó, se que faltan clases, pero esos 2 errores en especifico no se porque ocurrieron
    System.out.println(SistemaEstacionamiento.getTotalEntradas());
    System.out.println(SistemaEstacionamiento.getTotalSalidas());
 */