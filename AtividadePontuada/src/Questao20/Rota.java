package Questao20;

import java.util.ArrayList;

public class Rota {
    private String origem;
    private String destino;
    private ArrayList<Veiculo> veiculosDisponiveis;

    public Rota(String origem, String destino) {
        this.origem = origem;
        this.destino = destino;
        this.veiculosDisponiveis = new ArrayList<>();
    }

    public Rota() {
        veiculosDisponiveis = new ArrayList<>();
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public ArrayList<Veiculo> getVeiculosDisponiveis() {
        return veiculosDisponiveis;
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        this.veiculosDisponiveis.add(veiculo);
    }

    public String listarVeiculos() {
        String resultadoString = "";
        for (Veiculo veiculo : veiculosDisponiveis) {
            resultadoString += "Modelo: " + veiculo.getModelo() + ", Capacidade: " + veiculo.getCapacidade() + "\n";
        }
        return resultadoString;
    }
}
