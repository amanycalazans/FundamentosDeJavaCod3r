package a_fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // informações de um funcionario

        // tipos numéricos inteiros
        byte anosDeEmpresa=23;
        short numeroDeVoos=542;
        int id=56789;
        long pontosAcumulados =3_134_845_223L;

        //Tipos numéricos reais
        float salário=11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        //tipo booleano
        boolean estaDeFérias = false;  //true

        // Tipo caractere
        char status = 'A'; //ativo

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        //Número de viagens
        System.out.println(numeroDeVoos / 2);

        //Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + "ganha -> " + salário);
        System.out.println("Férias? " + estaDeFérias);
        System.out.println("Status: " + status);




    }
}
