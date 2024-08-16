package Ex3;

public class Email {
    private String remetente;
    private String conteudo;
    private String anexo;

    // Construtor e getters
    public Email(String remetente, String conteudo, String anexo) {
        this.remetente = remetente;
        this.conteudo = conteudo;
        this.anexo = anexo;
    }

    public String getRemetente() {
        return remetente;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String getAnexo() {
        return anexo;
    }
}

