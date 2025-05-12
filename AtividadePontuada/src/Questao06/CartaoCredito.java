package Questao06;

public class CartaoCredito extends MetodoPagamento {

    public CartaoCredito() {
        super(0.02); 
    }

    @Override
    public boolean processarPagamento(double valor) {
        if (taxa < 0.02) {
            System.out.println("Pagamento com cartão de crédito aprovado.");
            return true;
        } else {
            System.out.println("Taxa do cartão de crédito muito alta.");
            return false;
        }
    }
}
