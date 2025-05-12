package Questao12;

public class DescontoFidelidade implements EstrategiaDesconto {
    @Override
    public double calcularDesconto(double preco) {
        return preco * 0.05; 
    }
}
