package Questao20;

public class Onibus extends Veiculo {
    public Onibus(String modelo, int capacidade) {
        super(modelo, capacidade);
    }

    public Onibus() {
        super();
    }

    @Override
    public double calcularTempo(double distancia) {
        double velocidade = 60;
        return distancia / velocidade;
    }
}
