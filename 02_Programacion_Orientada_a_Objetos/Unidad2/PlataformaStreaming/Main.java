import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        PlataformaStreaming Pa = new PlataformaStreaming("Amazon Prime Video");
        //Perfiles
        Perfil perfil1 = new Perfil("Maria24");
        Perfil perfil2 = new Perfil("Maria98");
        Perfil perfil3 = new Perfil("Luisito");
        Perfil perfil4 = new Perfil("Maria9808");
        Perfil perfil5 = new Perfil("Mari258749");
        Perfil perfil6 = new Perfil("Lulu");
        //Usuarios
        Usuario usuario1 = new Usuario("Maria", "maria@gmail.com", List.of(perfil1,perfil2));
        Usuario usuario2 = new Usuario("Luis", "luis.@gmail.com", List.of(perfil3));
        Usuario usuario3 = new Usuario("Luisa", "luisa89.@gmail.com", List.of(perfil6));

        //contenidos
        Contenido contenido1 = new Contenido("Harry potter", "Fantasia");
        Contenido contenido2 = new Contenido("Los locos addams", "Terror");
        Contenido contenido3 = new Contenido("Hotel transilvania", "Fantasia");

        Pa.registrarUsuario(usuario1);
        Pa.registrarUsuario(usuario2);

        usuario1.agregarPerfil(perfil4);
        usuario1.agregarPerfil(perfil5);


        perfil1.agregarAFavoritos(contenido1);
        perfil1.agregarAFavoritos(contenido2);
        perfil2.agregarAFavoritos(contenido3);

        System.out.println("====Contenido====");
        System.out.println(contenido1.mostrarInfo());
        System.out.println(contenido2.mostrarInfo());
        System.out.println(contenido3.mostrarInfo());

        System.out.println("\n======Información general======");
        System.out.println("Usuarios registrados: " + Pa.getTotalUsuarios());

        System.out.println("\n======Información de usuarios======");
        System.out.println("Cantidad de perfiles de " + usuario1.getNombre() + ": " + usuario1.getTotalPerfiles());
        System.out.println("Los favoritos de " + perfil1.getNombrePerfil() + ": " + perfil1.getTotalFavoritos()
                + " y estos son: " + perfil1.mostrarFavoritos());
        System.out.println("Los favoritos de " + perfil2.getNombrePerfil() + ": " + perfil2.getTotalFavoritos()
                + " y estos son: " + perfil2.mostrarFavoritos());

    }
}
