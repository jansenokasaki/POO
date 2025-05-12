package Questao18;

public class Eletronico extends Produto {
    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    public Eletronico() {
    }

    @Override
    public double calcularDesconto() {
        return getPreco() * 0.1;
    }
}
