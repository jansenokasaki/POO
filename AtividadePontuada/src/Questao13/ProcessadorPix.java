package Questao13;

public class ProcessadorPix implements ProcessadorPagamento {
    @Override
    public boolean autorizarPagamento(double valor) {
        System.out.printf("Pagamento via Pix autorizado instantaneamente para R$%.2f.%n", valor);
        return true;
    }

    @Override
    public boolean processarPagamento(double valor) {
        System.out.printf("Processando pagamento via Pix de R$%.2f...%n", valor);
        return true;
    }
}
