package Questao19;

public class Design extends Tarefa {
    public Design(String descricao) {
        super(descricao);
    }

    public Design() {
    }

    @Override
    public String realizarTarefa() {
        return "Criando o design";
    }
}
