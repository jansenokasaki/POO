package Questao06;

public class SistemaPagamento {

    public boolean efetuarPagamento(MetodoPagamento metodo, double valor) {
        double valorComTaxa = valor + metodo.calcularTaxa(valor);
        System.out.println("Valor total com taxa: R$ " + valorComTaxa);
        return metodo.processarPagamento(valorComTaxa);
    }
}