package Questao16;

public class Tempero extends Ingrediente {
    public Tempero(String nome, double quantidade) {
        super(nome, quantidade);
    }

    public Tempero() {
    }

    @Override
    public String informar() {
        return "Tempero especial: " + getNome() + ", Quantidade: " + getQuantidade() + "g";
    }

}
