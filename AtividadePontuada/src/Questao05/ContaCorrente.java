package Questao05;

public class ContaCorrente extends Conta {
    private static final double TAXA_OPERACAO = 0.10;

    public ContaCorrente(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + TAXA_OPERACAO;
        if (valorComTaxa <= getSaldo()) {
            super.sacar(valorComTaxa);
            System.out.println("Taxa de operação de R$ " + TAXA_OPERACAO + " aplicada.");
        } else {
            System.out.println("Saldo insuficiente para saque e taxa.");
        }
    }
}
