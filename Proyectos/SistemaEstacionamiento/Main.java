public class Main {
    public static void main (String [] args){

        SistemaEstacionamiento smN1= new SistemaEstacionamiento("Sistema");
        Vehiculo v1= new Vehiculo("MYT45-45", "Standar","12:12 pm");
        Vehiculo v2= new Vehiculo("SDT02-78", "Standar","2:00 pm");
        Vehiculo v3= new Vehiculo("MKOI-95", "Standar","8:00 pm");
        Vehiculo v4= new Vehiculo();
        
     
        //Espacio
        Espacio es1= new Espacio (1);
        Espacio es2 = new Espacio(2);
        Espacio es3 = new Espacio(3);
       

        System.out.println("======REGISTRO DE ENTRADAS======\n");
        
        Ticket tic1 = smN1.registrarEntrada(v1, es1);
        System.out.println("\n");
        Ticket tic2 = smN1.registrarEntrada(v2, es2);
        System.out.println("\n");
        Ticket tic3 = smN1.registrarEntrada(v3, es3);
     

        System.out.println("======REGISTRO DE SALIDAS======\n");
        tic1.finalizar("2:00 am", "Libre");
        smN1.registrarSalidas(es1);
        tic3.finalizar("9:00 am", "Libre");
        smN1.registrarSalidas(es3);

        System.out.println("\n ========RESUMEN==========");
        System.out.println("Total entradas: " + SistemaEstacionamiento.getTotalEntradas());
        System.out.println("Total salidas: " + SistemaEstacionamiento.getTotalSalidas());
        System.out.println("Estado del espacio 1: " + (es1.estaLibre()? "Libre": "Ocupado"));
        System.out.println("Estado del espacio 2: " + (es2.estaLibre()? "Libre": "Ocupado"));
        System.out.println("Estado del espacio 3: " + (es3.estaLibre()? "Libre": "Ocupado"));
        System.out.println(" \n");

        System.out.println("========DETALLES DEL VEHICULO==========");
        System.out.println(tic1.obtenerDetalle());
        System.out.println("\n");
        System.out.println(tic2.obtenerDetalle());
        System.out.println("\n");
        System.out.println(tic3.obtenerDetalle());
  

       
        
}
}