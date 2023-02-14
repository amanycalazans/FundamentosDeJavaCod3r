package b_controle;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("informe sua nota parcial 1");
        double notaParcial1 = entrada.nextDouble();
        System.out.println("informe sua nota parcial 2");
        double notaParcial2 = entrada.nextDouble();

        double media = (notaParcial2 + notaParcial1)/2;
        if(media >= 7){
            System.out.println("Aprovado!");
        }
        else if (media>=4){
            System.out.println("Recuperação.");
        }
        else
            System.out.println("Reprovado.");


        entrada.close();
    }
}
