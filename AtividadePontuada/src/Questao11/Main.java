package Questao11;

public class Main {
    public static void main(String[] args) {
        GestorMensagens gestor = new GestorMensagens();

        EnvioMensagem email = new EnvioEmail();
        EnvioMensagem sms = new EnvioSMS();
        EnvioMensagem whatsapp = new EnvioWhatsApp();

        String mensagem = "Olá, esta é uma mensagem de teste.";

        System.out.println("Enviando mensagem por E-mail:");
        gestor.enviarMensagem(email, mensagem);
        System.out.println();

        System.out.println("Enviando mensagem por SMS:");
        gestor.enviarMensagem(sms, mensagem);
        System.out.println();

        System.out.println("Enviando mensagem por WhatsApp:");
        gestor.enviarMensagem(whatsapp, mensagem);
    }
}
