package Questao17;

public class Livro extends Material{
    public Livro() {
    }

    public Livro(String titulo) {
        super(titulo);
    }

    @Override
    public String informarMaterial() {
        return "Livro: " + getTitulo();
    }

    
}
