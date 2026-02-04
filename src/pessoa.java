//exercício 3

public class pessoa {

    //declarando atributos
    private String nome;
    private int idade;

    //construtor
    public pessoa(String nome, int idade) {//não esquecer de pasar os parâmetros para o construtor
        
        this.nome = nome;
        this.idade = idade;

    }

    //método de verificação de idade
    public void verificaIdade() {

        if(idade > 18) {
            System.out.println("Seu nome é " + nome + ". Você é maior de idade");
        } else {
            System.out.println("Seu nome é " + nome + ". Você é menor de idade");
        }

    }

}
