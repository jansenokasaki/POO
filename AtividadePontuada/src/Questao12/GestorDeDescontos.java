package Questao12;

public class GestorDeDescontos {
    public double aplicarDesconto(EstrategiaDesconto estrategia, double preco) {
        double desconto = estrategia.calcularDesconto(preco);
        return preco - desconto;
    }
}
