import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
public class LectorArchivos{
    public void lee(String ruta){
        try{
            FileReader archivo = new FileReader(ruta);
            int dato = archivo.read();
            System.out.println("Dato: " + (char) dato );
            archivo.close();

        }catch (FileNotFoundException e){
            System.out.println("Archivo no encotrado: " + ruta);

        } catch (IOException e){
            System.out.println("Error de lectura" + e.getMessage());
        }
    }

}

