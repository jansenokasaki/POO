package Questao15;

public class ControleNavio implements ControleAutonomo {
    @Override
    public String iniciarRota(String destino) {
        return "Iniciando navegação para " + destino + " com o navio autônomo.";
    }

    @Override
    public String ajustarVelocidade(double velocidade) {
        return "Ajustando a velocidade do navio para " + velocidade + " nós.";
    }
}
