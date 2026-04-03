public class Main {
    public static void main (String[] args){
        EmpleadoTiempoCompleto ETC= new EmpleadoTiempoCompleto("Pedro", 10000.00 , 250);
        EmpleadoPorHoras EPH= new EmpleadoPorHoras("Juan", 125.5, 6);
        ETC.getDescripcion();
        EPH.getDescripcion();
    }
}

