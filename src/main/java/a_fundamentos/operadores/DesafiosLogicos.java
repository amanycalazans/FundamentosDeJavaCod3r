package a_fundamentos.operadores;

public class DesafiosLogicos {
    public static void main(String[] args) {
        //Trabalho na terça
        //Trabalho na quinta

        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean tv32 = trabalho1 ^ trabalho2;
        boolean tv50 = trabalho1 && trabalho2;
        boolean sorvete = trabalho1 || trabalho2;
        //operados unário
        boolean maisSaudavel = !sorvete;

        System.out.println("\nvou comprar uma televisao de 32 polegadas; " + tv32);
        System.out.println("\nvou comprar uma televisao de 50 polegadas; " + tv50);
        System.out.println("\ntomei sorvete com a familia depois de comprar uma das tv's: " + sorvete);
        System.out.println("\nestou mais saudavel?" + maisSaudavel);


    }
}
