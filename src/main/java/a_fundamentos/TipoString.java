package a_fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("olá pessoal" .charAt(0));

        String a = "Boa tarde";
        System.out.println(a.concat("!!!!"));
        System.out.println(a.startsWith("Boa"));
        System.out.println(a.toLowerCase().startsWith("boa"));
        System.out.println(a.length());
        System.out.println(a.endsWith("tarde"));
        System.out.println(a.toLowerCase().equals("boa tarde"));
        System.out.println(a.equalsIgnoreCase("boa tarde"));

        var nome = "pedro";
        var sobrenome = "santos";
        var idade = 33;
        var salario = 1250.998;

        String frase = String.format("\nO senhor %s %s tem %d anos e recebe R$%.2f.",nome
                , sobrenome,idade ,salario );
        System.out.println(frase);

    }
}
