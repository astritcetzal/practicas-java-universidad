
public class Conversion {
    public static void main(String[] args){
       
        double celcius=0;
        int fahrenheit=0;
        System.out.println("°F °C");
        System.out.println("------------");
        for(fahrenheit=50; fahrenheit<=400; fahrenheit+=50){

            celcius= (fahrenheit-32)*5.0/9.0;
            System.out.println(fahrenheit + " "+ celcius);
        }

    }
}
