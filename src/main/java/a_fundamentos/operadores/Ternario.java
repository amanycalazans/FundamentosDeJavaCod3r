package a_fundamentos.operadores;

public class Ternario {
    public static void main(String[] args) {

        double media = 7.6;
        String resultadoRecuperaçaoParcial = media<=5.0 ?
                "em recuperaçao" : "reprovado";
        String resultado = media>= 7.0 ?
                "aprovado" : "em recuperação";
        System.out.println("O aluno está: " + resultado);

    }
}