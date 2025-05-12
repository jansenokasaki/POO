package Questao15;

public class ControleCarro implements ControleAutonomo {
    @Override
    public String iniciarRota(String destino) {
        return "Iniciando rota para " + destino + " com o carro autônomo.";
    }

    @Override
    public String ajustarVelocidade(double velocidade) {
        return "Ajustando a velocidade do carro para " + velocidade + " km/h.";
    }
}
