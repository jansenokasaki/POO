package Questao16;

import java.util.ArrayList;

public class Prato {
    private String nome;
    private ArrayList<Ingrediente> ingredientes;

    public Prato(String nome) {
        this.nome = nome;
        this.ingredientes = new ArrayList<>();
    }

    public Prato() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void adicionarIngrediente(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public String listarIngredientes() {
        String informacao = "";
        for (Ingrediente ingrediente : ingredientes) {
            informacao += ingrediente.informar() + "\n";
        }

        return informacao;
    }
}
