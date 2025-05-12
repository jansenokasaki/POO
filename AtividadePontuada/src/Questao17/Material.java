package Questao17;

public abstract class Material {
    private String titulo;

    public Material() {
    }

    public Material(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract String informarMaterial();
}
