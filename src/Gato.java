//exercicio 8

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
