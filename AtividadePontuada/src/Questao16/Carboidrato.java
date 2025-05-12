package Questao16;

public class Carboidrato extends Ingrediente {
    public Carboidrato(String nome, double quantidade) {
        super(nome, quantidade);
    }

    public Carboidrato() {
    }

    @Override
    public String informar() {
        return "Carboidrato: " + getNome() + ", Quantidade: " + getQuantidade() + "g";
    }

}
