package Questao13;

public class Main {
    public static void main(String[] args) {
        ProcessadorPagamento cartao = new ProcessadorCartao();
        ProcessadorPagamento pix = new ProcessadorPix();
        ProcessadorPagamento boleto = new ProcessadorBoleto();

        SistemaPagamento.realizarPagamento(cartao, 300.0);
        SistemaPagamento.realizarPagamento(pix, 1500.0);
        SistemaPagamento.realizarPagamento(boleto, 5.0);
        SistemaPagamento.realizarPagamento(boleto, 15.0);
    }
}
