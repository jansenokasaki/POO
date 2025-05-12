package Questao02;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Carro("Toyota", "Corolla", 2022, 4);
        Veiculo veiculo2 = new Motocicleta("Honda", "CB500", 2023, "Alto");

        veiculo1.informacoes();
        System.out.println();
        veiculo2.informacoes();
    }
}
