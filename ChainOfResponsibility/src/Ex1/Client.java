package Ex1;

public class Client {
    public static void main(String[] args) {
        Aprovador gerenteEquipe = new GerenteEquipe();
        Aprovador gerenteDepartamento = new GerenteDepartamento();
        Aprovador diretor = new Diretor();
        Aprovador ceo = new CEO();

        gerenteEquipe.setProximoAprovador(gerenteDepartamento);
        gerenteDepartamento.setProximoAprovador(diretor);
        diretor.setProximoAprovador(ceo);

        gerenteEquipe.aprovarDespesa(500);     
        gerenteEquipe.aprovarDespesa(5000);   
        gerenteEquipe.aprovarDespesa(20000);  
        gerenteEquipe.aprovarDespesa(75000);  
    }
}