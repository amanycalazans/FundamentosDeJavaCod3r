package b_controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String texto = "";
        do {
            System.out.println("Você precisa falar as palavras mágicas:");
            System.out.println("Quer sair?");
            texto = entrada.nextLine();
        }while(!texto.equals("Por favor"));
        System.out.print("Obrigada!");

        entrada.close();
    }
}
