package Questao09;

public class Main {
    public static void main(String[] args) {
        EditorImagem editor = new EditorImagem();

        Imagem imagemColorida = new ImagemColorida(1920, 1080);
        Imagem imagemPretoBranco = new ImagemPretoBranco(1280, 720);
        Imagem imagemTransparente = new ImagemTransparente(1024, 768);

        System.out.println("Informações da Imagem Colorida:");
        System.out.println(editor.exibirInformacoes(imagemColorida));
        System.out.println();

        System.out.println("Informações da Imagem Preto e Branco:");
        System.out.println(editor.exibirInformacoes(imagemPretoBranco));
        System.out.println();

        System.out.println("Informações da Imagem Transparente:");
        System.out.println(editor.exibirInformacoes(imagemTransparente));
        System.out.println();

        Imagem imagemAjustada = editor.ajustarImagem(imagemColorida, 800, 600);
        System.out.println("Informações da Imagem Ajustada:");
        System.out.println(editor.exibirInformacoes(imagemAjustada));
    }
}
