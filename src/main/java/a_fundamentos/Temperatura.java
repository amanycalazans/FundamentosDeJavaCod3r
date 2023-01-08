package a_fundamentos;

public class Temperatura {
    public static void main(String[] args) {

        double farenheit = 86;
                final double a= 32.0;
                final double b= 5/9.0;
                double Celsius= (farenheit - a) * b;
        System.out.println("o resultado é " + Celsius + "C°");

        farenheit=150;
                Celsius= (farenheit - a) * b;

        System.out.println("o resultado é " + Celsius + "C°");


    }
}
