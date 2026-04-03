import java.util.Scanner;

/* PISTAS RETO 2:
   - Diseño: En Java, ¿una clase puede hacer un 'extends' de dos clases al mismo tiempo?
   - Scanner: Hay lecturas de números seguidas de lecturas de texto. ¡Cuidado con el buffer!
   - Polimorfismo: Revisa minuciosamente los nombres de los métodos que se intentan sobrescribir.
   - Sintaxis: Faltan detalles sutiles pero obligatorios para que el código compile.
*/

abstract class DispositivoRed {
    protected String ip;
    
    public DispositivoRed(String ip) { 
        this.ip = ip; 
    }
    
    public abstract void configurar();
}


class Router extends DispositivoRed {
    private int puertos;
    private String protocolo;

    public Router(String ip, String protocolo, int puertos) {
        super(ip);
        this.protocolo = protocolo;
        this.puertos = puertos;
    }

    @Override
    public void configurar() {
        System.out.println("Configurando Router IP: " + ip + " | Protocolo: " + protocolo);
    }
}

class Switch extends DispositivoRed {
    private String tipo; 

    public Switch(String ip, String tipo) {
        super(ip);
        this.tipo = tipo;
    }

    public void configurar() {
        System.out.println("Configurando Switch " + tipo + " en IP: " + ip);
    }
}

public class MainRed {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DispositivoRed[] red = new DispositivoRed[2];

        for(int i = 0; i < red.length; i++) {
            System.out.println("\n¿Qué dispositivo agregar? (1. Router, 2. Switch)");
            int eleccion = teclado.nextInt();

            System.out.print("Ingresa la dirección IP: ");
            String ip = teclado.nextLine(); 
            teclado.nextLine();
            if(eleccion == 1) {
                System.out.print("Protocolo (ej. OSPF, BGP): ");
                String prot = teclado.nextLine();
                System.out.print("Número de puertos: ");
                int puertos = teclado.nextInt();
                red[i] = new Router(ip, prot, puertos);
            } else if (eleccion == 2) {
                System.out.print("Tipo (Capa 2 o Capa 3): ");
                String capa = teclado.nextLine();
                red[i] = new Switch(ip, capa);
            }
        }

        System.out.println("\n--- INICIANDO CONFIGURACIÓN DE RED ---");
        for(int i = 0; i < red.length; i++) {
            red[i].configurar(); 
        }
        
        teclado.close();
    }
}


