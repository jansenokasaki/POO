package Questao04;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();

        Produto p1 = new Computador("Dell XPS 13", 8000);
        Produto p2 = new Smartphone("iPhone 14", 6000);
        Produto p3 = new Tablet("iPad Pro", 4000);

        loja.adicionarProduto(p1);
        loja.adicionarProduto(p2);
        loja.adicionarProduto(p3);

        loja.listarGarantias();
    }
}