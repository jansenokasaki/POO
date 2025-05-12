package Questao08;

public abstract class MaterialBiblioteca {
    protected String titulo;
    protected int prazoDevolucao; 

    public MaterialBiblioteca(String titulo, int prazoDevolucao) {
        this.titulo = titulo;
        this.prazoDevolucao = prazoDevolucao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPrazoDevolucao() {
        return prazoDevolucao;
    }

    public abstract double calcularMulta(int diasAtraso);
}
