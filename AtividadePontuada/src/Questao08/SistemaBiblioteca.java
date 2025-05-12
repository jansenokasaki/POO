package Questao08;

public class SistemaBiblioteca {
    public void registrarEmprestimo(MaterialBiblioteca material) {
        System.out.println("Empréstimo registrado: " + material.getTitulo());
        System.out.println("Prazo de devolução: " + material.getPrazoDevolucao() + " dias");
    }

    public double calcularMulta(MaterialBiblioteca material, int diasAtraso) {
        return material.calcularMulta(diasAtraso);
    }
}
