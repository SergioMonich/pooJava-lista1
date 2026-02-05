import java.util.Scanner;

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

        pessoa1.verificaIdade();//invocando método criado na classe pessoa
        pessoa2.verificaIdade();

        //EX 4
        Produto produto1 = new Produto("Mouse sem fio", 49.90, 25);

        produto1.valorEstoque();

        //EX 5
        Dono dono1 = new Dono("Felipe", carro1); 
        Dono dono2 = new Dono("Lucas", carro2);
        
        dono1.infoDono();//invocando método criado na classe Dono
        dono2.infoDono();

        //EX 6
        int opcaoSwitchCase;
        
        ContaBancaria conta1 = new ContaBancaria(0.00);

        Scanner scnr = new Scanner(System.in);

        do {

            System.out.println("--->MENU<---");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");

            opcaoSwitchCase = scnr.nextInt();

            switch (opcaoSwitchCase) {
                
                case 1:
                    
                    conta1.mostrarSaldo();
                    break;

                case 2: 

                    System.out.println("Valor do deposito: ");
                    double valorDeposito = scnr.nextDouble();
                    conta1.depositar(valorDeposito);
                    break;
                    
                case 3:

                    System.out.println("Valor do saque: ");
                    double valorSaque = scnr.nextDouble();
                    conta1.sacar(valorSaque);
                    break;
                    
                case 0: 
                    System.out.println("Encerrendo...");
                    break;
            
                default:
                    
                    System.out.println("Opção inválida");
                    
            }

        } while (opcaoSwitchCase != 0);

            scnr.close();

        
        //EX 8
        Animal animal1 = new Animal(); //utilziando o construtor padrão
        Animal Todinho = new Animal("Todinho", 7); //utilizando o construtor com parametros
        Cachorro Rex = new Cachorro("Rex", 4);
        Gato Mizu = new Gato("Mizu", 6);

        animal1.emitirSom();
        Todinho.emitirSom();
        Rex.emitirSom(); //obejto da classe filha consegue acessar método genérico, porém um animal genérico não consegue acesar os métodos das classes filhas
        Rex.latir();
        Mizu.miar();

        

        //EX 9
        Funcionario Sergio = new Funcionario("Sergio", 5000);
        Gerente Felipe = new Gerente("Felipe", 7500);

        Sergio.mostrarSalario();
        Felipe.mostrarSalario();
        Felipe.aplicarBonus();
        Felipe.mostrarSalario();

    }

}
