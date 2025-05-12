package Questao14;

public class ExportadorPDF implements ExportadorRelatorio{
    public ExportadorPDF() {
    }

    @Override
    public String exportar(String titulo, String conteudo) {
        return "Exportando PDF: " + titulo + "\n" + conteudo;
    }
}