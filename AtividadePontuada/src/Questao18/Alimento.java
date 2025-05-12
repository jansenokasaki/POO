package Questao18;

public class Alimento extends Produto{
    public Alimento(String nome, double preco) {
        super(nome, preco);
    }

    public Alimento() {
    }

    @Override
    public double calcularDesconto() {
        return getPreco() * 0.05;
    }   

    
}
