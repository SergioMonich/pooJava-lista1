
/**
--> AUTOR...: SERGIO MONICH
--> DATA....: 04/02/2026
--> OBJETIVO: EXERCITAR OS CONCEITOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS COM TECNOLOGIA JAVA
--> GITHUB..: https://github.com/SergioMonich/
--> LINKEDIN: https://www.linkedin.com/in/sergiomonich/
*/

/**
 * @brief Instruções de execução
 * 
 * Para executar um exercício individual:
 * 1. Comente todos os blocos de exercícios na main
 * 2. Deixe descomentado apenas o exercício desejado
 * 3. Execute a aplicação normalmente
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     
        // *** Parte 1 - Conceitos Básicos de Objetos

        // ======================================================================================================================================================================
        /*
        EX 2 - Criação de Classe e Objeto: Crie uma classe Carro com atributos marca, modelo e ano. Instancie objetos dessa classe e imprima seus valores.
            a. Métodos Simples: Adicione um método exibirDetalhes() na classe Carro que imprime os detalhes do carro.
            b. Encapsulamento: Torne os atributos marca, modelo e ano privados e crie métodos getters e setters.
            c. Construtores: Adicione um construtor que receba os valores dos atributos da classe Carro no momento da instanciação.
            d. Contador de Objetos: Adicione um atributo estático na classe Carro para contar quantos carros foram criados.
            e. Métodos Estáticos: Crie um método estático na classe Carro que exibe quantos carros foram criados.
        */
        // ======================================================================================================================================================================
        /* 
        carro carro1 = new carro("Renault", "Sandero", 2017); // ao instanciar o objeto é preciso cumprir o contrato completo do construtor
        carro carro2 = new carro("Ford", "Ka", 2009);

        carro1.exibirDetalhes();// invocando o método criado na classe carro
        carro2.exibirDetalhes();

        carro.exibirTotal();// invocando o método criado na classe carro
        */
        // ======================================================================================================================================================================
        // EX 3 - Classe Pessoa: Crie uma classe Pessoa com nome e idade. Adicione um método para verificar se a pessoa é maior de idade.
        // ======================================================================================================================================================================
        /* 
        pessoa pessoa1 = new pessoa("Sergio", 44);
        pessoa pessoa2 = new pessoa("Micheli", 46);

        pessoa1.verificaIdade();// invocando método criado na classe pessoa
        pessoa2.verificaIdade();
        */
        // ======================================================================================================================================================================
        // EX 4 - Classe Produto: Crie uma classe Produto com nome, preco e quantidade. Implemente um método para calcular o valor total em estoque.
        // ======================================================================================================================================================================
        /*/
        Produto produto1 = new Produto("Mouse sem fio", 49.90, 25);

        produto1.valorEstoque();
        */
        // ======================================================================================================================================================================
        // EX 5 - Associação de Objetos: Crie uma classe Dono que possui um Carro. Instancie um objeto e relacione-o com um carro.
        // ======================================================================================================================================================================
        /*/
        Dono dono1 = new Dono("Felipe", carro1);
        Dono dono2 = new Dono("Lucas", carro2);

        dono1.infoDono();// invocando método criado na classe Dono
        dono2.infoDono();
        */
        // ======================================================================================================================================================================
        // EX 6 - Classe ContaBancaria: Implemente uma classe com saldo e métodos para depositar e sacar dinheiro.
        // ======================================================================================================================================================================
        /*
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
        */
        // *** Parte 2 - Herança

        // ======================================================================================================================================================================
        /*
        EX 8 - Criando uma Hierarquia de Classes: Crie uma classe Animal com os atributos nome e idade. Depois, crie as classes Cachorro e Gato que herdam de Animal.
            a. Métodos Específicos: Adicione métodos latir() em Cachorro e miar() em Gato.
            b. Sobrecarga de Construtores: Adicione várias formas de inicializar um Animal, incluindo um construtor padrão e outro que recebe nome e idade.
            c. Superclasse e Subclasses: Utilize super() dentro das subclasses para chamar o construtor da superclasse.
         */
        // ======================================================================================================================================================================
        /*
        Animal animal1 = new Animal(); // utilziando o construtor padrão
        Animal Todinho = new Animal("Todinho", 7); // utilizando o construtor com parametros
        Cachorro Rex = new Cachorro("Rex", 4);
        Gato Mizu = new Gato("Mizu", 6);

        animal1.emitirSom();
        Todinho.emitirSom();
        Rex.emitirSom(); // obejto da classe filha consegue acessar método genérico, porém um animal            
        Rex.latir(); // genérico não consegue acesar os métodos das classes filhas
        Mizu.miar();
        */
        // ======================================================================================================================================================================
        // EX 9 - Classe Funcionario e Gerente: Crie uma classe Funcionario com nome e salario. Crie uma subclasse Gerente que tem um bônus adicional.
        // ======================================================================================================================================================================
        /*
        Funcionario Sergio = new Funcionario("Sergio", 5000);
        Gerente Felipe = new Gerente("Felipe", 7500);

        Sergio.mostrarSalario();
        Felipe.mostrarSalario();
        Felipe.aplicarBonus();
        Felipe.mostrarSalario();
        */

        // ======================================================================================================================================================================
        // EX 10 - Classe Veiculo e Moto: Crie uma classe Veiculo e uma subclasse Moto. Adicione um atributo cilindrada e um método para exibi-lo.
        // ======================================================================================================================================================================
        /*
        Moto moto1 = new Moto(150, "Honda", "CG 150");
        Moto moto2 = new Moto(300, "Yamaha", "Fazer");
        Moto moto3 = new Moto(650, "Royal Enfield", "Shotgun");

        moto1.exibirInformacoes();
        moto2.exibirInformacoes();
        moto3.exibirInformacoes();
        */

        // ======================================================================================================================================================================
        // EX 11 - Classe Professor e Aluno: Crie uma hierarquia onde Aluno e Professor herdam de Pessoa, cada um com atributos específicos. 
        // ======================================================================================================================================================================
        /*
        Professor professor1 = new Professor("Robeta", 45, "Java", "ADS");
        Professor professor2 = new Professor("Antonio", 36, "Banco de Dados", "ESW");

        Aluno aluno1 = new Aluno("Marcos", 22, "MATUTINO", "2A");
        Aluno aluno2 = new Aluno("Carla", 26, "NOTURNO", "1B");

        professor1.infoProfessor();
        professor2.infoProfessor();

        aluno1.infoAluno();
        aluno2.infoAluno();
        */

        // ======================================================================================================================================================================
        // EX 12 - Classe InstrumentoMusical: Crie uma superclasse InstrumentoMusical e subclasses como Violao e Piano, cada uma com um método tocar(). 
        // ======================================================================================================================================================================
    
        Violao violao1 = new Violao("Takamine", "GD11 MCE MGS", "Mogno");
        Piano piano1 = new Piano("Yamaha", "CLP-800", "Preto");

        violao1.tocar();
        piano1.tocar();

    }

}
