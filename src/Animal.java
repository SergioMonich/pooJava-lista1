// ======================================================================================================================================================================
/*
EX 8 - Criando uma Hierarquia de Classes: Crie uma classe Animal com os atributos nome e idade. Depois, crie as classes Cachorro e Gato que herdam de Animal.
    a. Métodos Específicos: Adicione métodos latir() em Cachorro e miar() em Gato.
    b. Sobrecarga de Construtores: Adicione várias formas de inicializar um Animal, incluindo um construtor padrão e outro que recebe nome e idade.
    c. Superclasse e Subclasses: Utilize super() dentro das subclasses para chamar o construtor da superclasse.
 */
// ======================================================================================================================================================================

public class Animal {

    //declarando os atributos
    private String nome;
    private int idade;

    //construtor padrão (define valores "default")
    public Animal() {
        
        this.nome = "sem nome";
        this.idade = 0;
    }
    
    //construtor com parametros
    public Animal(String nome, int idade) {

        this.nome = nome;
        this.idade = idade;

    }

    //método genérico
    public void emitirSom() {

        System.out.println(nome + " fez som...");

    }

}
