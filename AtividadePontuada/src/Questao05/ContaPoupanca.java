package Questao05;

public class ContaPoupanca extends Conta {
    private static final double RENDIMENTO_PERCENTUAL = 0.05;

    public ContaPoupanca(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    public void adicionarRendimento() {
        double rendimento = getSaldo() * RENDIMENTO_PERCENTUAL;
        depositar(rendimento);
        System.out.println("Rendimento de 5% aplicado: R$ " + rendimento);
    }
}
