package Questao05;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
        System.out.println("Conta de " + conta.getTitular() + " adicionada com sucesso.");
    }

    public void gerarRelatorio() {
        System.out.println("\nRelatório de Contas:");
        for (Conta conta : contas) {
            System.out.println("Titular: " + conta.getTitular() + " | Saldo: R$ " + conta.getSaldo());
        }
    }
}
