package Questao10;

public class Main {
    public static void main(String[] args) {
        GestorProjeto gestor = new GestorProjeto();

        MembroEquipe dev = new Desenvolvedor("Alice", "Sistema de Vendas");
        MembroEquipe designer = new Designer("Bob", "Sistema de Vendas");
        MembroEquipe gerente = new GerenteDeProjetos("Carol", "Sistema de Vendas");

        gestor.adicionarMembro(dev);
        gestor.adicionarMembro(designer);
        gestor.adicionarMembro(gerente);

        System.out.println(gestor.exibirRelatorio(dev));
        System.out.println(gestor.exibirRelatorio(designer));
        System.out.println(gestor.exibirRelatorio(gerente));

        System.out.println("\nEquipe do projeto 'Sistema de Vendas':");
        for (MembroEquipe membro : gestor.listarEquipePorProjeto("Sistema de Vendas")) {
            System.out.println(membro.obterDetalhes());
        }
    }
}
