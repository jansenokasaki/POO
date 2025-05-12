package Questao19;

public class Desenvolvimento extends Tarefa {
    public Desenvolvimento(String descricao) {
        super(descricao);
    }

    public Desenvolvimento() {
    }

    @Override
    public String realizarTarefa() {
        return "Desenvolvendo o software: " + getDescricao();
    }
    
}
