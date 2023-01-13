package a_fundamentos.operadores;

public class Logicos {
    public static void main(String[] args) {

        //&& "e"
        //|| "ou"
        //^ um deles é verdadeiro = verdadeiro
        //! contrario

        boolean condiçao1 = true;
        boolean condiçao2 = 3>7;
        System.out.println(condiçao1 && condiçao2);
        System.out.println(condiçao1 || condiçao2);
        System.out.println(condiçao1 ^ condiçao2);
        System.out.println(!condiçao1);
        System.out.println(!condiçao2);


        System.out.println("\nTabela verdade E (AND)");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("\nTabela verdade OU (OR)");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("\nTabela verdade OU exclusivo (XOR)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("\nTabela verdade NOT");
        System.out.println(!true);
        System.out.println(!false);

    }
}
