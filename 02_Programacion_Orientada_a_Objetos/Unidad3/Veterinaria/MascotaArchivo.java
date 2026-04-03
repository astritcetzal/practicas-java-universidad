import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MascotaArchivo {

    private String rutaArchivo;

    public MascotaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    // Escritura
    // Printwriter + FileWritee con try - with resources (closable();)
    public void guardar(List<Mascota> mascotas) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter(rutaArchivo))) {
            for (Mascota masc : mascotas) {
                pw.println(masc.toCSV()); // toCSV() convierte a texto a las "Mascotas"
            }
        }
    }

    // Lectura
    // BufferedReader + FileReader + try with resources
    public List<Mascota> cargar() throws IOException {
        List<Mascota> mascotas = new ArrayList<>();

        File archivo = new File(rutaArchivo);
        if (!archivo.exists()) {
            return mascotas;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.trim().isEmpty()) {
                    try {
                        mascotas.add(Mascota.fromCSV(linea));
                    } catch (IllegalArgumentException e) {
                        System.out.println("Linea ignorada " + e.getMessage());
                    }
                }

            }
            return mascotas;
        }

    }

}
