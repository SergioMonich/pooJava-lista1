//exercío 5

public class Dono {

    //declarando os atributos
    private String nome;
    private carro carro; //a associação acontece aqui, quando a classe Dono tem um atributo do tipo carro (classe carro)

    //construtor
    public Dono(String nome, carro carro) {

        this.nome = nome;
        this.carro = carro;

    }

    //método para confirmar a associação
    public void infoDono() {

        System.out.println("Dono:" + nome);
        carro.exibirDetalhes();

    }

}
