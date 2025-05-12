package Questao12;

public class Main {
    public static void main(String[] args) {
        double precoOriginal = 200.00; 

        GestorDeDescontos gestor = new GestorDeDescontos();

        EstrategiaDesconto fidelidade = new DescontoFidelidade();
        EstrategiaDesconto sazonal = new DescontoSazonal();
        EstrategiaDesconto promocional = new DescontoPromocional();

        System.out.println("Preço original: R$ " + precoOriginal);

        double precoComDescontoFidelidade = gestor.aplicarDesconto(fidelidade, precoOriginal);
        System.out.println("Preço com desconto por fidelidade: R$ " + precoComDescontoFidelidade);

        double precoComDescontoSazonal = gestor.aplicarDesconto(sazonal, precoOriginal);
        System.out.println("Preço com desconto sazonal: R$ " + precoComDescontoSazonal);

        double precoComDescontoPromocional = gestor.aplicarDesconto(promocional, precoOriginal);
        System.out.println("Preço com desconto promocional: R$ " + precoComDescontoPromocional);
    }
}
