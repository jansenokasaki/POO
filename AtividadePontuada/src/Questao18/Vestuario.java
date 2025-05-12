package Questao18;

public class Vestuario extends Produto {
    public Vestuario(String nome, double preco) {
        super(nome, preco);
    }

    public Vestuario() {
    }

    @Override
    public double calcularDesconto() {
        return getPreco() * 0.15;
    }

}
