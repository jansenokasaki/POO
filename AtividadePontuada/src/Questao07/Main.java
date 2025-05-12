package Questao07;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(5, 120.0);
        Aviao aviao = new Aviao(180, 900.0);
        Navio navio = new Navio(1000, 50.0);

        GestorDeTransporte gestor = new GestorDeTransporte();

        double distancia = 1000.0; 

        System.out.println("Viagem de Carro:");
        System.out.println(gestor.calcularViagem(carro, distancia));
        System.out.println();

        System.out.println("Viagem de Avião:");
        System.out.println(gestor.calcularViagem(aviao, distancia));
        System.out.println();

        System.out.println("Viagem de Navio:");
        System.out.println(gestor.calcularViagem(navio, distancia));
    }
}
