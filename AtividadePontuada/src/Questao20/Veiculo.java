package Questao20;

public abstract class Veiculo {
    private String modelo;
    private int capacidade;

    public Veiculo(String modelo, int capacidade) {
        this.modelo = modelo;
        this.capacidade = capacidade;
    }

    public Veiculo() {
        this.modelo = "";
        this.capacidade = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public abstract double calcularTempo(double distancia);
}
