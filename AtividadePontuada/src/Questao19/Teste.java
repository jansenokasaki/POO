package Questao19;

public class Teste extends Tarefa {
    public Teste(String descricao) {
        super(descricao);
    }

    public Teste() {
    }

    @Override
    public String realizarTarefa() {
        return "Realizando o teste";
    }

}
