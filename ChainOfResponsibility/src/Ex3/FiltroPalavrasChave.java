package Ex3;

public class FiltroPalavrasChave extends Filtro {
    @Override
    public void verificarEmail(Email email) {
        if (email.getConteudo().contains("Ganhe dinheiro rápido")) {
            System.out.println("Bloqueado pelo filtro de palavras-chave.");
        } else if (proximoFiltro != null) {
            proximoFiltro.verificarEmail(email);
        }
    }
}