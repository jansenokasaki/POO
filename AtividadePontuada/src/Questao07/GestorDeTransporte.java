package Questao07;

public class GestorDeTransporte {

    public String calcularViagem(Veiculo veiculo, double distancia) {
        double tempo = veiculo.calcularTempo(distancia);
        String combustivel = veiculo.tipoDeCombustivel();
        return String.format("Tempo de viagem: %.2f horas\nTipo de combustível: %s", tempo, combustivel);
    }
}
