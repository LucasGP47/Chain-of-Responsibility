package Ex1;

public class CEO extends Aprovador {
    @Override
    public void aprovarDespesa(double quantia) {
        System.out.println("CEO aprovou a despesa de $" + quantia);
    }
}