package Ex1;

public class GerenteEquipe extends Aprovador {
    @Override
    public void aprovarDespesa(double quantia) {
        if (quantia <= 1000) {
            System.out.println("Gerente de Equipe aprovou a despesa de $" + quantia);
        } else if (proximoAprovador != null) {
            proximoAprovador.aprovarDespesa(quantia);
        }
    }
}