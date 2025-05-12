package Questao17;

public class SistemaEmprestimo  implements Emprestavel{
    public SistemaEmprestimo() {
    }

    @Override
    public boolean emprestar(Usuario usuario) {
        if (usuario != null) {
            System.out.println("Empréstimo realizado com sucesso para o usuário: " + usuario.getNome());
            return true;
        } else {
            System.out.println("Usuário inválido.");
            return false;
        }
    }

    @Override
    public boolean devolver(Usuario usuario) {
        if (usuario != null) {
            System.out.println("Devolução realizada com sucesso para o usuário: " + usuario.getNome());
            return true;
        } else {
            System.out.println("Usuário inválido.");
            return false;
        }
    }

    
}
