// ======================================================================================================================================================================
// EX 13 - Classe Empregado e Especializações: Crie uma hierarquia onde Empregado tem subclasses Programador e Designer, cada uma com um método que imprime sua função.
//=======================================================================================================================================================================

public class Empregado {

    protected String nome;
    protected String funcao;
    
    public Empregado(String nome, String funcao) {
        
        this.nome = nome;
        this.funcao = funcao;
    
    }

}
