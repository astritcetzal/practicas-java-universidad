import vehiculo.*;
import ticket.*;
import sistemaEstacionamiento.SistemaEstacionamiento;
import espacio.Espacio;
public class Main {
    public static void main (String [] args){
    
        SistemaEstacionamiento SistemaE= new SistemaEstacionamiento("Tec-S");

        Vehiculo A1= new Auto("123", "8 am", "Auto");
        Vehiculo A2= new Auto("124", "10 am", "Auto");
        Vehiculo M1= new Moto ("221", "8 am", 1569);
        Vehiculo M2= new Moto ("222", "11 am", 1976);
        Vehiculo A3= new Auto("123", "8 am", "Auto");
        
        Espacio es1= new Espacio (1);
        Espacio es2 = new Espacio(2);
        Espacio es3 = new Espacio(3);
        Espacio es4 = new Espacio(3);

        Ticket t1= SistemaE.registrarEntrada(A1, es1);
        Ticket t2= SistemaE.registrarEntrada(A2, es2);
        Ticket t3= SistemaE.registrarEntrada(M1, es3);
        Ticket t4= SistemaE.registrarEntrada(M2, es4);

        SistemaE.obtenerEstadoEspacios();

        SistemaE.registrarSalidas(es1, t1,"12 am",4 );
        SistemaE.registrarSalidas(es2, t2, "1 am", 15);
        
        SistemaE.generarTicket(t1);
        SistemaE.generarTicket(t2);
        SistemaE.calcularTotalTarifas();

        SistemaE.obtenerEstadoEspacios();


        
}
}