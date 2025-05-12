package Questao13;

public class ProcessadorCartao implements ProcessadorPagamento {
    @Override
    public boolean autorizarPagamento(double valor) {
        System.out.printf("Autorizando pagamento com cartão no valor de R$%.2f...%n", valor);
        return valor <= 5000; 
    }

    @Override
    public boolean processarPagamento(double valor) {
        System.out.printf("Processando pagamento com cartão de R$%.2f...%n", valor);
        return true;
    }
}
