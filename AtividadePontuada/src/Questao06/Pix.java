package Questao06;

public class Pix extends MetodoPagamento {

    public Pix() {
        super(0.0); 
    }

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Pagamento via Pix realizado com sucesso.");
        return true;
    }
}
