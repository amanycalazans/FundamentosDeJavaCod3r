package a_fundamentos.operadores;

public class Relacionais {
    public static void main(String[] args) {

        int a = 97;
        int b = 'a';

        System.out.println(a == b);
        System.out.println(3 > 4);
        System.out.println(3 >= 3);
        System.out.println(3 < 7);
        System.out.println(30 <= 4);
        System.out.println(3 != 4);


        double nota = 7.3;
        boolean bomCOmportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomCOmportamento && passouPorMedia;
        String resultado = temDesconto ? "sim" : "nao";

        System.out.println("tem desconto? " + temDesconto);

    }
}
