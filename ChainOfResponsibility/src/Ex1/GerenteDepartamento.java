package Ex1;

public class GerenteDepartamento extends Aprovador {
    @Override
    public void aprovarDespesa(double quantia) {
        if (quantia <= 10000) {
            System.out.println("Gerente de Departamento aprovou a despesa de $" + quantia);
        } else if (proximoAprovador != null) {
            proximoAprovador.aprovarDespesa(quantia);
        }
    }
}