package Questao14;

public class ExportadorXML implements ExportadorRelatorio {
    public ExportadorXML() {
    }

    @Override
    public String exportar(String titulo, String conteudo) {
        return "Exportando XML: " + titulo + "\n" + conteudo;
    }

}