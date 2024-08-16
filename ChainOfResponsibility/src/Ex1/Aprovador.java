package Ex1;

public abstract class Aprovador {
    protected Aprovador proximoAprovador;

    public void setProximoAprovador(Aprovador proximoAprovador) {
        this.proximoAprovador = proximoAprovador;
    }

    public abstract void aprovarDespesa(double quantia);
}