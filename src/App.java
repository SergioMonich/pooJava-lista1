import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {
        
        //EX 2
        carro carro1 = new carro("Renault", "Sandero", 2017); //ao instanciar o objeto é preciso cumprir o contrato completo do construtor
        carro carro2 = new carro("Ford", "Ka", 2009);
        
        carro1.exibirDetalhes();//invocando o método criado na classe carro
        carro2.exibirDetalhes();

        carro.exibirTotal();//invocando o método criado na classe carro

        //EX 3
        pessoa pessoa1 = new pessoa("Sergio", 44);
        pessoa pessoa2 = new pessoa("Micheli", 46);

        pessoa1.verificaIdade();
        pessoa2.verificaIdade();

        //EX 4
        Produto produto1 = new Produto("Mouse sem fio", 49.90, 25);

        produto1.valorEstoque();
        

    }
}
