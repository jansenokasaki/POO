package Questao18;

public class Main {
    public static void main(String[] args) throws Exception {
        Eletronico eletronico = new Eletronico("Smartphone", 1500.00);
        Vestuario vestuario = new Vestuario("Camisa", 100.00);
        Alimento alimento = new Alimento("Arroz", 20.00);

        Fornecedor fornecedor = new Fornecedor("Fornecedor 1");
        fornecedor.adicionarProduto(eletronico);
        fornecedor.adicionarProduto(vestuario);
        fornecedor.adicionarProduto(alimento);

        System.out.println(fornecedor.listarProdutosFornecidos());
        System.out.println("Desconto do Eletrônico: R$ " + eletronico.calcularDesconto());
        System.out.println("Desconto do Vestuário: R$ " + vestuario.calcularDesconto());
        System.out.println("Desconto do Alimento: R$ " + alimento.calcularDesconto());

        fornecedor.fornecerProduto(alimento);
    }
}
