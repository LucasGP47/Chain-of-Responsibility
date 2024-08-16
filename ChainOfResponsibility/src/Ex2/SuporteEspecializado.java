package Ex2;

public class SuporteEspecializado extends Suporte {
    @Override
    public void atenderSolicitacao(String tipo) {
        if (tipo.equalsIgnoreCase("Especializado")) {
            System.out.println("Suporte Especializado: Resolvido no nível especializado.");
        } else {
            System.out.println("Solicitação não pode ser resolvida.");
        }
    }
}