package c_classe;

public class Produto {
    String nome;
    double preco;
    double desconto;

    double precoComDesconto(double precoDoGerente){
        return preco * (1 - desconto + precoDoGerente);
    }
}
