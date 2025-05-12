package Questao06;

public class Main {
    public static void main(String[] args) {
        SistemaPagamento sistema = new SistemaPagamento();

        MetodoPagamento cartao = new CartaoCredito();
        MetodoPagamento pix = new Pix();
        MetodoPagamento boleto = new Boleto();

        double valorCompra = 100.0;

        System.out.println("Tentando pagamento com Cartão de Crédito:");
        sistema.efetuarPagamento(cartao, valorCompra);

        System.out.println("\nTentando pagamento com Pix:");
        sistema.efetuarPagamento(pix, valorCompra);

        System.out.println("\nTentando pagamento com Boleto:");
        sistema.efetuarPagamento(boleto, valorCompra);
    }
}
