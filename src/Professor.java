// ======================================================================================================================================================================
// EX 11 - Classe Professor e Aluno: Crie uma hierarquia onde Aluno e Professor herdam de Pessoa, cada um com atributos específicos. 
// ======================================================================================================================================================================

public class Professor extends pessoa {

    private String materia;
    private String curso;
    
    public Professor(String nome, int idade, String materia, String curso) {
        
        super(nome, idade);
        this.materia = materia;
        this.curso = curso;

    }

    public void infoProfessor() {

        System.out.println("Professor: " + nome);

        System.out.println("Materia: " + materia);
        System.out.println("Curso: " + curso);

    }
    
}
