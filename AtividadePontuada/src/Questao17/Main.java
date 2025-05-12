package Questao17;

public class Main {
    public static void main(String[] args) throws Exception {
        Livro livro = new Livro("O Senhor dos Anéis");
        Revista revista = new Revista("National Geographic");
        Usuario usuario = new Usuario("João");
        usuario.adicionarMaterial(livro);
        usuario.adicionarMaterial(revista);

        Usuario usuario2 = new Usuario("Maria");
        DVD dvd = new DVD("Star Wars");
        usuario2.adicionarMaterial(dvd);

        System.out.println(livro.informarMaterial());
        System.out.println(revista.informarMaterial());

        SistemaEmprestimo sistema = new SistemaEmprestimo();
        sistema.emprestar(usuario);
        sistema.devolver(usuario2);
    }
}
