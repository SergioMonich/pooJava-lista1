//exercício 4

public class Produto {

    //declarando atributos
    private String nome;
    private double preco;
    private int quantidade;

    //construtor
    public Produto(String nome, double preco, int quantidade) { //o obejeto do construtor deve ter o mesmo nome da classe (produto -> produto || Produto -> Produto)

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    //método de calculo de estoque
    public void valorEstoque() {
        
        System.out.println("Produto:" + nome);
        System.out.println("Total quantidade:" + quantidade);
        System.out.println("Total valor: R$" + (quantidade * preco));

    }

}


