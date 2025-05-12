package Questao17;

public class DVD extends Material  {
    public DVD() {
    }

    public DVD(String titulo) {
        super(titulo);
    }

    @Override
    public String informarMaterial() {
        return "DVD: " + getTitulo();
    }
}
