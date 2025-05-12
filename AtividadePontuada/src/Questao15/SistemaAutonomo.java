package Questao15;

public class SistemaAutonomo {
    public String navegar(ControleAutonomo controle, String destino, double velocidade) {
        String rota = controle.iniciarRota(destino);
        String velocidadeAjustada = controle.ajustarVelocidade(velocidade);
        return rota + "\n" + velocidadeAjustada;
    }
}
