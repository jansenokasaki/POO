package Questao14;

public class ExportadorCSV implements ExportadorRelatorio {
    public ExportadorCSV() {
    }

    @Override
    public String exportar(String titulo, String conteudo) {
        return "Exportando CSV: " + titulo + "\n" + conteudo;
    }

}