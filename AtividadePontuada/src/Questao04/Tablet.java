package Questao04;

public class Tablet extends Produto {
    public Tablet(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public int calcularGarantia() {
        return 1;
    }
}
