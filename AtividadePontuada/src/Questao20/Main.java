package Questao20;

public class Main {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro("Fusca", 4);
        Moto moto = new Moto("CB 500", 2);
        Onibus onibus = new Onibus("Volvo", 50);

        Rota rota = new Rota("São Paulo", "Rio de Janeiro");
        rota.adicionarVeiculo(carro);
        rota.adicionarVeiculo(moto);
        rota.adicionarVeiculo(onibus);

        SistemaReservas sistemaReservas = new SistemaReservas();
        sistemaReservas.reservar("2023-10-01", rota);
        System.out.println("Tempo estimado para o carro: " + carro.calcularTempo(1000) + " horas");
    }
}
