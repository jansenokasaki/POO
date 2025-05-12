package Questao05;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        ContaCorrente cc = new ContaCorrente("João Silva", 1000.00);
        ContaPoupanca cp = new ContaPoupanca("Maria Oliveira", 2000.00);
        ContaSalario cs = new ContaSalario("Carlos Souza", 3000.00);

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);
        banco.adicionarConta(cs);

        cc.depositar(500);
        cp.sacar(300);
        cp.adicionarRendimento();
        cs.sacar(100);
        cs.sacar(100);
        cs.sacar(100);
        cs.sacar(100);
        cs.sacar(100);

        banco.gerarRelatorio();
    }
}
