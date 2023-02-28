package c_classe;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4356.69;
        p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Caneta preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double produtoFinal1= p1.preco * (1 - p1.desconto);
        double produtoFinal2= p2.preco * (1 - p2.desconto);
        double mediaDoCarrinho = (produtoFinal1 + produtoFinal2) / 2;

        System.out.printf("\nmedia do carrinho: R$%.2f.", mediaDoCarrinho);
    }
}
