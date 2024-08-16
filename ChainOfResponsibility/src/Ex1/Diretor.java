package Ex1;

public class Diretor extends Aprovador {
    @Override
    public void aprovarDespesa(double quantia) {
        if (quantia <= 50000) {
            System.out.println("Diretor aprovou a despesa de $" + quantia);
        } else if (proximoAprovador != null) {
            proximoAprovador.aprovarDespesa(quantia);
        }
    }
}