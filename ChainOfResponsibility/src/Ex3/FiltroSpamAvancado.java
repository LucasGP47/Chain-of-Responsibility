package Ex3;

public class FiltroSpamAvancado extends Filtro {
    @Override
    public void verificarEmail(Email email) {
        if (algoritmoComplexoDetectaSpam(email)) {
            System.out.println("Bloqueado pelo filtro de spam avançado.");
        } else {
            System.out.println("Email aprovado.");
        }
    }

    private boolean algoritmoComplexoDetectaSpam(Email email) {     
        return false; 
    }
}