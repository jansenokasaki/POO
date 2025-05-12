package Questao20;

public class SistemaReservas implements Reservavel{
    public SistemaReservas() {
    }

    @Override
    public boolean reservar(String data, Rota rota) {
        System.out.println("Reserva realizada para a rota: " + rota.getOrigem() + " - " + rota.getDestino() + " na data: " + data);
        return true;
    }
    
}
