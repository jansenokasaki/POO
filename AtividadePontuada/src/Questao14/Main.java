package Questao14;

public class Main {
    public static void main(String[] args) throws Exception {
        ExportadorCSV ExportadorCSV = new ExportadorCSV();
        ExportadorPDF ExportadorPDF = new ExportadorPDF();
        String titulo = "Relatório de Vendas";
        String conteudo = "Vendas do mês de janeiro: 1000 unidades vendidas.";

        String resultadoCSV = ExportadorCSV.exportar(titulo, conteudo);
        String resultadoPDF = ExportadorPDF.exportar(titulo, conteudo);

        System.out.println(resultadoCSV);
        System.out.println(resultadoPDF);

    }
}