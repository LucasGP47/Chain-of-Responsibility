package Ex3;

public abstract class Filtro {
    protected Filtro proximoFiltro;

    public void setProximoFiltro(Filtro proximoFiltro) {
        this.proximoFiltro = proximoFiltro;
    }

    public abstract void verificarEmail(Email email);
}
