package test;

import animal.Animal;
import animal.Gato;
import animal.Perro;

public class testAnimal {
    public static void main (String [] args ){
        Animal perro = new Perro();
        Animal gato = new Gato();

        hacerSonidoDeAnimal(perro);
        hacerSonidoDeAnimal(gato);
    }

    public static void hacerSonidoDeAnimal(Animal animal){
        animal.hacerSonido();
    }
}
