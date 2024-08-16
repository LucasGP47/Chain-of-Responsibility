package Ex3;

public class FiltroRemetenteBloqueado extends Filtro {
    @Override
    public void verificarEmail(Email email) {
        if (email.getRemetente().equals("spammer@exemplo.com")) {
            System.out.println("Bloqueado pelo filtro de remetente.");
        } else if (proximoFiltro != null) {
            proximoFiltro.verificarEmail(email);
        }
    }
}