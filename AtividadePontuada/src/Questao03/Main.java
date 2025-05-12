package Questao03;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Funcionario f1 = new Gerente("Carlos Silva", 5000, 1500);
        Funcionario f2 = new Desenvolvedor("Ana Souza", 4000, 1.2);
        Funcionario f3 = new Estagiario("Lucas Oliveira", 1500);

        empresa.adicionarFuncionario(f1);
        empresa.adicionarFuncionario(f2);
        empresa.adicionarFuncionario(f3);

        empresa.calcularFolhaDePagamento();
    }
}
