package Questao03;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios;

    public Empresa() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void calcularFolhaDePagamento() {
        double totalFolha = 0;
        for (Funcionario f : funcionarios) {
            System.out.println(f.getNome() + " - Salário: R$ " + f.calcularSalario());
            totalFolha += f.calcularSalario();
        }
        System.out.println("Total da Folha de Pagamento: R$ " + totalFolha);
    }
}
