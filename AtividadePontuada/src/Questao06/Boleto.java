package Questao06;

public class Boleto extends MetodoPagamento {

    public Boleto() {
        super(0.05);
    }

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Pagamento via boleto processado com sucesso.");
        return true;
    }
}
