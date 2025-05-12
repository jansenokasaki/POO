package Questao04;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Produto> produtos;

    public Loja() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void listarGarantias() {
        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " - Garantia: " + produto.calcularGarantia() + " ano(s)");
        }
    }
}
