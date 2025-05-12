package Questao16;

public class PratoSimples implements Preparo{
    public PratoSimples() {
    }

    public void adicionarIngrediente(Ingrediente ingrediente) {
        System.out.println("Adicionando ingrediente: " + ingrediente.informar());
    }

    public String preparar() {
        return "Prato simples preparado com sucesso!";
    }
}
