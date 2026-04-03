import java.util.Scanner;
public class Ticket {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int Sub_total = 0;
        double Total =0;
        System.out.println("ingrese el Codigo del producto");
        String Codigo_producto = sc.nextLine();
        System.out.println("ingrese el Precio del producto");
        int Precio = sc.nextInt();
        System.out.println("Los 3 hermanos");
        while (Codigo_producto.length() != 0)
        {
            Sub_total = Sub_total + Precio;
            System.out.println(Codigo_producto + Precio);
            System.out.println("Ingrese el codigo del producto");
            Codigo_producto = sc.nextLine();
            sc.next();
            System.out.println("Ingrese el precio del producto");
            Total = sc.nextInt();
          
        }
            
            double IVA = Sub_total*0.15;
            Total = Sub_total + IVA;
            System.out.println("Sub Total: " + Sub_total);
            System.out.println("IVA:" + IVA);
            System.out.println("Total: " + Total);
            
        sc.close();
        return;
    }
}
