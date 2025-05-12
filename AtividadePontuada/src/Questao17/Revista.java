package Questao17;

public class Revista extends Material{
    public Revista() {
    }

    public Revista(String titulo) {
        super(titulo);
    }

    @Override
    public String informarMaterial() {
        return "Revista: " + getTitulo();
    }

}
