package Questao16;

public class Main {
    public static void main(String[] args) throws Exception {
        Ingrediente ingrediente1 = new Carboidrato("Arroz", 100);
        Ingrediente ingrediente2 = new Proteina("Frango", 200);

        PratoSimples pratoSimples = new PratoSimples();
        pratoSimples.adicionarIngrediente(ingrediente1);
        pratoSimples.adicionarIngrediente(ingrediente2);

        System.out.println(pratoSimples.preparar());
    }
}
