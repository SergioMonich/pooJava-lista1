// ======================================================================================================================================================================
// EX 11 - Classe Professor e Aluno: Crie uma hierarquia onde Aluno e Professor herdam de Pessoa, cada um com atributos específicos. 
// ======================================================================================================================================================================

public class Aluno extends pessoa {

    private String turno;
    private String turma;
    
    public Aluno(String nome, int idade, String turno, String turma) {
        
        super(nome, idade);
        this.turno = turno;
        this.turma = turma;

    }

    public void infoAluno() {

        System.out.println("Aluno: " + nome);
        System.out.println("Turno: " + turno);
        System.out.println("Turma: " + turma);

    }

}
