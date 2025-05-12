package Questao08;

public class Main {
    public static void main(String[] args) {
        SistemaBiblioteca sistema = new SistemaBiblioteca();

        MaterialBiblioteca livro = new Livro("Java para Iniciantes", 7);
        MaterialBiblioteca revista = new Revista("Revista Tech", 5);
        MaterialBiblioteca dvd = new DVD("Filme Ação", 3);

        sistema.registrarEmprestimo(livro);
        sistema.registrarEmprestimo(revista);
        sistema.registrarEmprestimo(dvd);

        int diasAtraso = 4;
        System.out.println("Multa do livro: R$ " + sistema.calcularMulta(livro, diasAtraso));
        System.out.println("Multa da revista: R$ " + sistema.calcularMulta(revista, diasAtraso));
        System.out.println("Multa do DVD: R$ " + sistema.calcularMulta(dvd, diasAtraso));
    }
}
