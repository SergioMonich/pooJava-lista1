// ======================================================================================================================================================================
/*
EX 8 - Criando uma Hierarquia de Classes: Crie uma classe Animal com os atributos nome e idade. Depois, crie as classes Cachorro e Gato que herdam de Animal.
    a. Métodos Específicos: Adicione métodos latir() em Cachorro e miar() em Gato.
    b. Sobrecarga de Construtores: Adicione várias formas de inicializar um Animal, incluindo um construtor padrão e outro que recebe nome e idade.
    c. Superclasse e Subclasses: Utilize super() dentro das subclasses para chamar o construtor da superclasse.
 */
// ======================================================================================================================================================================

//definição da subclasse ("extends")
public class Gato extends Animal {

    //invocando o construtor da superclasse ("super")
    public Gato(String nome, int idade) {
        
        super(nome, idade);
        
    }

    //método específico
    public void miar() {

        System.out.println("miau miau...");

    }

}
