package Ex2;

public abstract class Suporte {
    protected Suporte proximoSuporte;

    public void setProximoSuporte(Suporte proximoSuporte) {
        this.proximoSuporte = proximoSuporte;
    }

    public abstract void atenderSolicitacao(String tipo);
}