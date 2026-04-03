public class Entrenador {
    private String especialidad ;
    public Entrenador(String especialidad){
    this.especialidad= especialidad;
    }
    public void asignarRutina(Socio socio, double monto){
        Gimnasio.registrarPago(monto);
        System.out.println("El socio: "+socio.getNombre() + " ha pagado una especialidad de: " + especialidad);    }   
}
