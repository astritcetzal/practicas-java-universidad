package persona;

public class Persona {
    protected String name;
    protected int edad;

    public Persona(){}

    public Persona (String name, int edad){
        this.name = name;
        this.edad = edad;
    }
    public String mostrarDatos(){
        return "name: " + name + " edad: " + edad;
    }

    public String getName(){
        return name;
    }

    public void  setName(String name){
        this.name = name;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad= edad;
    }

    @Override
    public String toString(){
        return "Persona{" + "'name='" +
        name + '\'' + "', edad=" + edad + '}';
    }
}
