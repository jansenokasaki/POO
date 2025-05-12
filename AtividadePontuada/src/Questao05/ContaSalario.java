package Questao05;

public class ContaSalario extends Conta {
    private static final int LIMITE_SAQUES_MENSAL = 4;
    private int saquesRealizados;

    public ContaSalario(String titular, double saldoInicial) {
        super(titular, saldoInicial);
        this.saquesRealizados = 0;
    }

    @Override
    public void sacar(double valor) {
        if (saquesRealizados < LIMITE_SAQUES_MENSAL) {
            super.sacar(valor);
            saquesRealizados++;
            System.out.println("Saque realizado. Saques restantes no mês: " + (LIMITE_SAQUES_MENSAL - saquesRealizados));
        } else {
            System.out.println("Limite de saques mensais atingido.");
        }
    }

    public void reiniciarSaques() {
        saquesRealizados = 0;
        System.out.println("Limite de saques mensal reiniciado.");
    }
}
