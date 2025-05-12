package Questao16;

public class Proteina extends Ingrediente {
    public Proteina(String nome, double quantidade) {
        super(nome, quantidade);
    }

    public Proteina() {
    }

    @Override   
    public String informar() {
        return "Proteina: " + getNome() + ", Quantidade: " + getQuantidade() + "g";
    }
}
