package Questao19;

import java.util.ArrayList;

public class MembroEquipe implements Papel {
    private String nome;
    private Papel papel;
    private ArrayList<Tarefa> tarefas;

    public MembroEquipe(String nome) {
        this.nome = nome;
        this.tarefas = new ArrayList<>();
    }

    public MembroEquipe() {
        tarefas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Papel getPapel() {
        return papel;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public String listarTarefas() {
        String resultado = "Tarefas de " + nome + ":\n";
        for (Tarefa tarefa : tarefas) {
            resultado += "- " + tarefa.getDescricao() + "\n";
        }
        return resultado;
    }

    @Override
    public String executarPapel() {
        String resultado = "Executando papel\n";
        for (Tarefa tarefa : tarefas) {
            resultado += tarefa.realizarTarefa() + "\n";
        }
        return resultado;
    }
}
