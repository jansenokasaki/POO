package Questao18;

import java.util.ArrayList;

public class Fornecedor implements Fornecimento {
    private String nome;
    private ArrayList<Produto> produtosFornecidos;


    public Fornecedor() {
        produtosFornecidos = new ArrayList<>();
    }

    public Fornecedor(String nome) {
        produtosFornecidos = new ArrayList<>();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Produto> getProdutosFornecidos() {
        return produtosFornecidos;
    }

    public void adicionarProduto(Produto produto) {
        produtosFornecidos.add(produto);
    }

    public String listarProdutosFornecidos() {
        String resultado = "Produtos fornecidos por " + nome + ":\n";
        for (Produto produto : produtosFornecidos) {
            resultado += "- " + produto.getNome() + " (R$ " + produto.getPreco() + ")\n";
        }
        return resultado;
    }

    @Override
    public boolean fornecerProduto(Produto produto) {
        if (produtosFornecidos.contains(produto)) {
            System.out.println("Produto " + produto.getNome() + " fornecido com sucesso.");
            return true;
        } else {
            System.out.println("Produto " + produto.getNome() + " não está disponível.");
            return false;
        }
    }

}
