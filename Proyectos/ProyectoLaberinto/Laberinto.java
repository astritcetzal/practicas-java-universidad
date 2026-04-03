import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Laberinto {

    public static final Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.println("\n===== MENU DEL JUEGO =====");
        System.out.println("1. Jugar");
        System.out.println("2. Salir");
    }

    private static final String ARCHIVO_ENTRADA1 = "Laberinto1.txt";

    public static void mostrarDirecciones() {
        String[] direcciones = { "W - Arriba", "A - Izquierda", "S - Abajo", "D - Derecha" };
        System.out.println("\n===== DIRECCIONES DISPONIBLES =====");
        for (int i = 0; i < direcciones.length; i++) {
            System.out.println((i + 1) + ". " + direcciones[i]);
        }
        System.out.println("===================================\n");
    }

    public static char[][] cargarLaberinto(String nombreArchivo) {
        try {

            BufferedReader br1 = new BufferedReader(new FileReader(nombreArchivo));
            int numFilas = 0;
            int numColumnas = 0;
            String linea;

            while ((linea = br1.readLine()) != null) {
                numFilas++;
                if (linea.length() > numColumnas) {
                    numColumnas = linea.length();
                }
            }
            br1.close();

            char[][] laberinto = new char[numFilas][numColumnas];

            BufferedReader br2 = new BufferedReader(new FileReader(nombreArchivo));
            int fila = 0;

            while ((linea = br2.readLine()) != null) {

                for (int col = 0; col < linea.length(); col++) {
                    laberinto[fila][col] = linea.charAt(col);
                }
                for (int col = linea.length(); col < numColumnas; col++) {
                    laberinto[fila][col] = ' ';
                }
                fila++;
            }
            br2.close();

            System.out
                    .println("Laberinto cargado exitosamente (" + numFilas + " filas x " + numColumnas + " columnas)");
            return laberinto;

        } catch (Exception e) {
            System.out.println("Error al cargar el laberinto: " + e.getMessage());
            return null;
        }
    }

    public static void mostrarLaberinto(char[][] laberinto, int jugadorFila, int jugadorCol) {
        System.out.println("\n===== LABERINTO =====");
        for (int i = 0; i < laberinto.length; i++) {
            for (int j = 0; j < laberinto[i].length; j++) {
                if (i == jugadorFila && j == jugadorCol) {
                    System.out.print('P');
                } else {
                    System.out.print(laberinto[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("=====================\n");
    }

    public static int[] encontrarEntrada(char[][] laberinto) {
        for (int i = 0; i < laberinto.length; i++) {
            for (int j = 0; j < laberinto[i].length; j++) {
                if (laberinto[i][j] == 'E') {

                    int[] posicion = new int[2];
                    posicion[0] = i;
                    posicion[1] = j;
                    return posicion;
                }
            }
        }
        System.out.println("Error: No se encontró la entrada (E) en el laberinto.");
        return null;
    }

    public static int[] calcularNuevaPosicion(int[] posicionActual, String movimiento) {

        int[] nuevaPosicion = new int[2];
        nuevaPosicion[0] = posicionActual[0];
        nuevaPosicion[1] = posicionActual[1];

        switch (movimiento) {
            case "W":
                nuevaPosicion[0]--;
                break;
            case "S":
                nuevaPosicion[0]++;
                break;
            case "A":
                nuevaPosicion[1]--;
                break;
            case "D":
                nuevaPosicion[1]++;
                break;
        }

        return nuevaPosicion;
    }

    public static boolean estaSalida(char[][] laberinto, int fila, int col) {
        return laberinto[fila][col] == 'S';
    }

    public static boolean validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Error: El nombre no puede estar vacío.");
            return false;
        }

        for (int i = 0; i < nombre.length(); i++) {
            char c = nombre.charAt(i);
            if (!Character.isLetter(c) && c != ' ') {
                System.out.println("Error: El nombre solo puede contener letras y espacios.");
                return false;
            }
        }

        if (nombre.trim().length() < 2) {
            System.out.println("Error: El nombre debe tener al menos 2 caracteres.");
            return false;
        }

        return true;
    }

    public static boolean validarOpcionMenu(int opcion, int min, int max) {
        if (opcion < min || opcion > max) {
            System.out.println("Error: Opción no válida. Debe estar entre " + min + " y " + max + ".");
            return false;
        }
        return true;
    }

    public static boolean validarMovimiento(String movimiento) {
        if (movimiento == null || movimiento.isEmpty()) {
            System.out.println("Error: Debe ingresar un movimiento.");
            return false;
        }

        String mov = movimiento.toUpperCase().trim();

        if (mov.length() != 1) {
            System.out.println("Error: El movimiento debe ser una sola letra.");
            return false;
        }

        char comando = mov.charAt(0);
        if (comando != 'W' && comando != 'A' && comando != 'S' && comando != 'D') {
            System.out.println("Error: Movimiento inválido. Use W (arriba), A (izquierda), S (abajo), D (derecha).");
            return false;
        }

        return true;
    }

    public static boolean validarCoordenadas(int fila, int columna, char[][] laberinto) {
        if (fila < 0 || fila >= laberinto.length) {
            System.out.println("Error: No puedes salir de los límites del laberinto (fila fuera de rango).");
            return false;
        }

        if (columna < 0 || columna >= laberinto[0].length) {
            System.out.println("Error: No puedes salir de los límites del laberinto (columna fuera de rango).");
            return false;
        }

        return true;
    }

    public static boolean validarNoMuro(int fila, int columna, char[][] laberinto) {
        if (laberinto[fila][columna] == '#') {
            System.out.println("Error: No puedes atravesar un muro.");
            return false;
        }
        return true;
    }

    public static boolean validarMovimientoPosible(int fila, int columna, char[][] laberinto) {
        if (!validarCoordenadas(fila, columna, laberinto)) {
            return false;
        }

        if (!validarNoMuro(fila, columna, laberinto)) {
            return false;
        }

        return true;
    }

    public static boolean validarLaberinto(char[][] laberinto) {
        if (laberinto == null || laberinto.length == 0) {
            System.out.println("Error: El laberinto está vacío o no se cargó correctamente.");
            return false;
        }

        boolean tieneEntrada = false;
        boolean tieneSalida = false;

        for (int i = 0; i < laberinto.length; i++) {
            for (int j = 0; j < laberinto[i].length; j++) {
                if (laberinto[i][j] == 'E') {
                    tieneEntrada = true;
                }
                if (laberinto[i][j] == 'S') {
                    tieneSalida = true;
                }
            }
        }

        if (!tieneEntrada) {
            System.out.println("Error: El laberinto no tiene una entrada (E).");
            return false;
        }

        if (!tieneSalida) {
            System.out.println("Error: El laberinto no tiene una salida (S).");
            return false;
        }

        return true;
    }

    public static boolean validarArchivoExiste(String nombreArchivo) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            br.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error: No se pudo encontrar o leer el archivo '" + nombreArchivo + "'.");
            return false;
        }
    }

    static void guardarResultado(String nombreMayus, int movimientos, boolean llego, String archivo) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(archivo, true))) {
            pw.println(nombreMayus + " | movimientos: " + movimientos + " | llego: " + llego);
        } catch (IOException e) {
            System.out.println("Error al guardar resultados: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        int opciones = 0;
        do {
            try {
                menu();
                String texto = sc.nextLine();
                opciones = Integer.parseInt(texto);
                switch (opciones) {
                    case 1:

                        String nombre;
                        do {
                            System.out.print("Ingresa tu nombre: ");
                            nombre = sc.nextLine().trim();
                            if (!validarNombre(nombre)) {
                                System.out.println("Vuelva a intentarlo");
                                System.out.println("");
                            }
                        } while (!validarNombre(nombre));
                        String nombreMayus = nombre.toUpperCase();
                        if (!validarArchivoExiste(ARCHIVO_ENTRADA1)) {
                            System.out.println("Error: No se puede cargar el laberinto.");
                            break;
                        }

                        char[][] laberinto = cargarLaberinto(ARCHIVO_ENTRADA1);

                        if (laberinto == null) {
                            System.out.println("Error al cargar el laberinto.");
                            break;
                        }

                        if (!validarLaberinto(laberinto)) {
                            System.out.println("El laberinto no es válido.");
                            break;
                        }
                        int[] posicionInicial = encontrarEntrada(laberinto);

                        if (posicionInicial == null) {
                            System.out.println("Error: No se puede iniciar el juego.");
                            break;
                        }
                        int jugadorFila = posicionInicial[0];
                        int jugadorCol = posicionInicial[1];
                        int movimientos = 0;
                        boolean llego = false;

                        mostrarLaberinto(laberinto, jugadorFila, jugadorCol);
                        mostrarDirecciones();

                        boolean juegoTerminado = false;

                        while (!juegoTerminado) {
                            System.out.println("Usa W, A, S, D para moverte. Presiona 'Q' para salir.");
                            String movimiento = sc.nextLine().trim().toUpperCase();

                            if (movimiento.equals("Q")) {
                                System.out.println("Saliendo del juego...");
                                juegoTerminado = true;
                                continue;
                            }

                            if (!movimiento.equals("W") && !movimiento.equals("A") &&
                                    !movimiento.equals("S") && !movimiento.equals("D")) {
                                System.out.println("Comando inválido. Usa W, A, S, D o Q para salir.");
                                continue;
                            }
                            int[] posicionActual = new int[2];
                            posicionActual[0] = jugadorFila;
                            posicionActual[1] = jugadorCol;
                            int[] nuevaPosicion = calcularNuevaPosicion(posicionActual, movimiento);

                            int nuevoJugadorFila = nuevaPosicion[0];
                            int nuevoJugadorCol = nuevaPosicion[1];
                            if (!validarMovimientoPosible(nuevoJugadorFila, nuevoJugadorCol, laberinto)) {
                                continue;
                            }
                            jugadorFila = nuevoJugadorFila;
                            jugadorCol = nuevoJugadorCol;
                            movimientos++;

                            mostrarLaberinto(laberinto, jugadorFila, jugadorCol);
                            mostrarDirecciones();

                            if (estaSalida(laberinto, jugadorFila, jugadorCol)) {
                                System.out.println("¡Felicidades! Llegaste a la salida (S)!");
                                llego = true;
                                juegoTerminado = true;
                            }
                        }

                        guardarResultado(nombreMayus, movimientos, llego, "laberinto_historial.txt");
                        System.out.println("Resultado guardado en laberinto_historial.txt");
                        opciones = 2;
                        break;
                    case 2:
                        System.out.println("Gracias por jugar. ¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");

                }
            } catch (Exception e) {
                System.out.println("Error general: " + e.getMessage());

            }
        } while (opciones != 2);
    }
}
