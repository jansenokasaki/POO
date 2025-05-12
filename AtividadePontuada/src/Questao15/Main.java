package Questao15;

public class Main {
    public static void main(String[] args) {
        SistemaAutonomo sistema = new SistemaAutonomo();
        String destino = "Ilha de Fernando de Noronha";
        double velocidade = 20.0;

        ControleAutonomo carro = new ControleCarro();
        System.out.println(sistema.navegar(carro, destino, velocidade));

        ControleAutonomo drone = new ControleDrone();
        System.out.println(sistema.navegar(drone, destino, velocidade));

        ControleAutonomo navio = new ControleNavio();
        System.out.println(sistema.navegar(navio, destino, velocidade));
    }
}
