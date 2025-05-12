package Questao11;

public class EnvioWhatsApp implements EnvioMensagem {
    private String status;

    @Override
    public boolean enviar(String mensagem) {
        status = "Mensagem via WhatsApp enviada com sucesso!";
        return true;
    }

    @Override
    public String obterStatus() {
        return status;
    }
}
