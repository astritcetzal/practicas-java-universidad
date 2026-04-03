import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class PlatilloArchivo {

    private String rutaArchivo;

    public PlatilloArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public void guardar(List<Platillo> platillos) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter(rutaArchivo))) {
            for (Platillo plat : platillos) {
                pw.println(plat.toCSV());
            }
        }

    }

    public List<Platillo> cargar() throws IOException {
        List<Platillo> platillos = new ArrayList<>();
        File archivo = new File(rutaArchivo);

        if (!archivo.exists()) {
            return platillos;

        } // Primera ejecución: lista vacía
          // para segunda ejecución
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                if (!linea.trim().isEmpty()) {
                    try {
                        platillos.add(Platillo.fromCSV(linea));
                    } catch (IllegalArgumentException e) {
                        System.out.println("Linea ignorada " + e.getMessage());
                    }
                }
            }
            return platillos;
        }
    }

}