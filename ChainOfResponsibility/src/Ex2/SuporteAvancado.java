package Ex2;

public class SuporteAvancado extends Suporte {
    @Override
    public void atenderSolicitacao(String tipo) {
        if (tipo.equalsIgnoreCase("Avançado")) {
            System.out.println("Suporte Avançado: Resolvido no nível avançado.");
        } else if (proximoSuporte != null) {
            proximoSuporte.atenderSolicitacao(tipo);
        }
    }
}