//exercicio 8

//subclasse 
public class Cachorro extends Animal {

    //invocando o construtor da superclasse
    public Cachorro(String nome, int idade) {

        super(nome, idade);

    }

    //métido específico
    public void latir() {

        System.out.println("au au au...");

    }

}
