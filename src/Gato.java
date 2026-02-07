// ======================================================================================================================================================================
/*
EX 8 - Criando uma Hierarquia de Classes: Crie uma classe Animal com os atributos nome e idade. Depois, crie as classes Cachorro e Gato que herdam de Animal.
    a. Métodos Específicos: Adicione métodos latir() em Cachorro e miar() em Gato.
    b. Sobrecarga de Construtores: Adicione várias formas de inicializar um Animal, incluindo um construtor padrão e outro que recebe nome e idade.
    c. Superclasse e Subclasses: Utilize super() dentro das subclasses para chamar o construtor da superclasse.
 */
// ======================================================================================================================================================================

// ======================================================================================================================================================================
// EX 15 - Polimorfismo de Sobrescrita: Modifique Animal para que tenha um método emitirSom(). Em Cachorro e Gato, sobrescreva esse método. 
// ======================================================================================================================================================================

//definição da subclasse ("extends")
public class Gato extends Animal {

    //invocando o construtor da superclasse ("super")
    public Gato(String nome, int idade) {
        
        super(nome, idade);
        
    }

    public void miar() {

        System.out.println(nome + " fez miau miau...");

    }


    //sobrescrita de método
    @Override
    public void emitirSom() {
        
        System.out.println(nome + " fez miau miau...");
    
    }

    

}
