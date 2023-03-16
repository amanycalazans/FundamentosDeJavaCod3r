package c_classe;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();
        d1.dia = 1;
        d1.mes = 3;
        d1.ano = 2023;

        var d2 = new Data();
        d2.dia = 31;
        d2.mes = 6;
        d2.ano = 2025;

        String dataDeHoje1 = d1.obterDataFormatada();
        String dataDeHoje2 = d2.obterDataFormatada();

        System.out.println(dataDeHoje1);
        System.out.println(dataDeHoje2);
    }
}
