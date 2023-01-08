package a_fundamentos;

import java.util.Scanner;
public class Console {
    public static void main(String[] args) {
        System.out.print("bom");
        System.out.print(" dia/n");

        System.out.println("bom");
        System.out.println("dia");
        System.out.printf("megasena: %d %d %d %d %n"
                ,1 ,2 ,3 ,4);
        System.out.printf("salario: %.1f %n",1243.656 );

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.println("nome: "+ nome + " " + sobrenome);

        System.out.print("digite sua idade: ");
        int idade =entrada.nextInt();
        System.out.printf("%s %s tem %d anos.",nome,sobrenome,idade);

        entrada.close();
    }
}
