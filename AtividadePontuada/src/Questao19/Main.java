package Questao19;

public class Main {
    public static void main(String[] args) throws Exception {
        Desenvolvimento desenvolvimento = new Desenvolvimento("Desenvolvimento de software");
        Teste teste = new Teste("Teste de software");
        Design design = new Design("Design de software");

        MembroEquipe membro1 = new MembroEquipe("Felipe");
        MembroEquipe membro2 = new MembroEquipe("Bob");
        MembroEquipe membro3 = new MembroEquipe("Marcone");

        membro1.adicionarTarefa(desenvolvimento);
        membro2.adicionarTarefa(teste);
        membro3.adicionarTarefa(design);

        System.out.println(membro1.listarTarefas());
        System.out.println(membro2.listarTarefas());
        System.out.println(membro3.listarTarefas());

        System.out.println(membro1.executarPapel());
        System.out.println(membro2.executarPapel());
        System.out.println(membro3.executarPapel());
    }
}
