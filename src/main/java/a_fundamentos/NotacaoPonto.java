package a_fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Bomdia X!!";
        s = s.replace("X", "senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");
        System.out.println(s);

        String x = "amany" .toUpperCase();
        System.out.println(x);

        String y = "bom dia x"
                .replace("x", "amany")
                        .toUpperCase()
                                .concat("!!!!");
        System.out.println(y);

        //Tipos primitivos nao tem operador "."
        int a=3;
    }
}
