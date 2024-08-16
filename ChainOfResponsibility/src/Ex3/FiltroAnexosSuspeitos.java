package Ex3;

public class FiltroAnexosSuspeitos extends Filtro {
    @Override
    public void verificarEmail(Email email) {
        if (email.getAnexo().endsWith(".exe")) {
            System.out.println("Bloqueado pelo filtro de anexos suspeitos.");
        } else if (proximoFiltro != null) {
            proximoFiltro.verificarEmail(email);
        }
    }
}