package Ex3;

public class Client {
    public static void main(String[] args) {
        Filtro filtroPalavrasChave = new FiltroPalavrasChave();
        Filtro filtroRemetenteBloqueado = new FiltroRemetenteBloqueado();
        Filtro filtroAnexosSuspeitos = new FiltroAnexosSuspeitos();
        Filtro filtroSpamAvancado = new FiltroSpamAvancado();

        filtroPalavrasChave.setProximoFiltro(filtroRemetenteBloqueado);
        filtroRemetenteBloqueado.setProximoFiltro(filtroAnexosSuspeitos);
        filtroAnexosSuspeitos.setProximoFiltro(filtroSpamAvancado);

        Email email = new Email("spammer@exemplo.com", "Ganhe dinheiro rápido com este método!", "documento.exe");

        filtroPalavrasChave.verificarEmail(email);
    }
}
