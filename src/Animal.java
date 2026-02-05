//exercicio 8

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

    public void emitirSom() {

        System.out.println(nome + " fez som...");

    }

}
