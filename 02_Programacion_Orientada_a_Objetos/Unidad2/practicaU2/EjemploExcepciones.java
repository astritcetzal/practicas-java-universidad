class Aexception extends Exception {
public Aexception() {
}
}
class Bexception extends Exception {
public Bexception() {
}
}
class EjemploExcepciones{
public static void main(String [] args){
int valor=Integer.parseInt(args[0]);
try {
if (valor==3) throw new Aexception();
if (valor==5) throw new Bexception();
System.out.println("llega hasta aqui");
} //Fin del bloque try
catch(Aexception a){
System.out.println("Error tipo A");
}
catch(Bexception b){
System.out.println("Error tipo B");
}
finally{
System.out.println("Ahora me toca a mi");
}
System.out.println("Imprimeme");
}
}