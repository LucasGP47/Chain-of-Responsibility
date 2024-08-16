package Ex2;

public class Client {
    public static void main(String[] args) {
        Suporte basico = new SuporteBasico();
        Suporte avancado = new SuporteAvancado();
        Suporte especializado = new SuporteEspecializado();

        basico.setProximoSuporte(avancado);
        avancado.setProximoSuporte(especializado);

        basico.atenderSolicitacao("Básico");
        basico.atenderSolicitacao("Avançado");
        basico.atenderSolicitacao("Especializado");
        basico.atenderSolicitacao("Inexistente");
    }
}
