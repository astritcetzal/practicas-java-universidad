public class Orquesta {
    private String nombreOrquesta;
    public Orquesta(String nombreOrquesta){
        this.nombreOrquesta= nombreOrquesta;
    }

    public void crearOrquesta(){
        Piano piano = new Piano ("Piano de cola");
        piano.afinar();
        Flauta flauta = new Flauta ("flautin");
        flauta.tocar();
        Violin violin = new Violin(" Violin eslectrico");
        violin.afinar();
        violin.Mantenimiento();
        Tuba tuba = new Tuba ("Tuba bajo");
        tuba.Mantenimiento();
        tuba.afinar();
    }

    public void guardarOrquesta(){
        System.out.println("Se ha guardado la orqueta " + nombreOrquesta);
    }

}