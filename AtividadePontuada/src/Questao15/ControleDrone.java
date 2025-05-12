package Questao15;

public class ControleDrone implements ControleAutonomo {
    @Override
    public String iniciarRota(String destino) {
        return "Iniciando voo para " + destino + " com o drone autônomo.";
    }

    @Override
    public String ajustarVelocidade(double velocidade) {
        return "Ajustando a velocidade do drone para " + velocidade + " km/h.";
    }
}
