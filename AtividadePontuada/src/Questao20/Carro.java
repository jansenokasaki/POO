package Questao20;

public class Carro extends Veiculo {
    public Carro(String modelo, int capacidade) {
        super(modelo, capacidade);
    }

    public Carro() {
        super();
    }

    @Override
    public double calcularTempo(double distancia) {
        double velocidade = 80;
        return distancia / velocidade;
    }


    
}
