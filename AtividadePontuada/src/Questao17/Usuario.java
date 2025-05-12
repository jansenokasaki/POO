package Questao17;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private ArrayList<Material> materiaisEmprestados;

    public Usuario(String nome) {
        this.nome = nome;
        this.materiaisEmprestados = new ArrayList<>();
    }

    public Usuario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Material> getMateriaisEmprestados() {
        return materiaisEmprestados;
    }

    public void adicionarMaterial(Material material) {
        materiaisEmprestados.add(material);
    }

    public String listarMateriaisEmprestados() {
        String resultado = "Materiais emprestados por " + nome + ":\n";
        for (Material material : materiaisEmprestados) {
            resultado += material.informarMaterial() + "\n";
        }
        return resultado;
    }
}
