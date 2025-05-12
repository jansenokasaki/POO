package Questao13;

public class ProcessadorBoleto implements ProcessadorPagamento {
    @Override
    public boolean autorizarPagamento(double valor) {
        boolean autorizado = valor > 10.0;
        System.out.printf("Autorizando boleto de R$%.2f... %s%n", valor, autorizado ? "Autorizado" : "Não autorizado");
        return autorizado;
    }

    @Override
    public boolean processarPagamento(double valor) {
        System.out.printf("Processando boleto de R$%.2f...%n", valor);
        return true;
    }
}
