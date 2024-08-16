package Ex2;

public class SuporteBasico extends Suporte {
    @Override
    public void atenderSolicitacao(String tipo) {
        if (tipo.equalsIgnoreCase("Básico")) {
            System.out.println("Suporte Básico: Resolvido no nível básico.");
        } else if (proximoSuporte != null) {
            proximoSuporte.atenderSolicitacao(tipo);
        }
    }
}