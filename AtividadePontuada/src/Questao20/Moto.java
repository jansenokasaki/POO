package Questao20;

public class Moto extends Veiculo {
    public Moto(String modelo, int capacidade) {
        super(modelo, capacidade);
    }

    public Moto() {
        super();
    }

    @Override
    public double calcularTempo(double distancia) {
        double velocidade = 100;
        return distancia / velocidade;
    }

    

}
