public class Gimnasio {
    private static double ingresosTotales=0;
    public static void registrarPago(double monto){
        ingresosTotales+= monto;
    }
    public static double getTotalIngresos(){
        return ingresosTotales;
    }
}
