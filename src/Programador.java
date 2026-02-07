// ======================================================================================================================================================================
// EX 13 - Classe Empregado e Especializações: Crie uma hierarquia onde Empregado tem subclasses Programador e Designer, cada uma com um método que imprime sua função.
//=======================================================================================================================================================================

public class Programador extends Empregado {

    private String senioridade;

    public Programador(String nome, String funcao, String senioridade) {
        
        super(nome, funcao);
        this.senioridade = senioridade;
    
    }

    public void mostrarFuncao() {

        System.out.println("Nome: " + nome);
        System.out.println("Função: " + funcao);
        System.out.println("Experiência: " + senioridade);

    }

}
