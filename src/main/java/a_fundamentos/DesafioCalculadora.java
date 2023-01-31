package a_fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("\nPrimeiro número");
        double num1 = entrada.nextDouble();
        System.out.print("\nSegundo número");
        double num2 = entrada.nextDouble();
        System.out.print("\nInforme a operação:");
        System.out.print("\nsinal");
        String sinal = entrada.next();

        double resultado = "+".equals(sinal)? num1 + num2 : 0;
        resultado = "-".equals(sinal) ? num1 - num2 : resultado;
        resultado = "*".equals(sinal) ? num1 * num2 : resultado;
        resultado = "/".equals(sinal) ? num1 / num2 : resultado;
        resultado = "%".equals(sinal) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f"
                ,num1, sinal, num2 , resultado);

        entrada.close();
    }
}
