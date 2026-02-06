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

public class carro {
    //declarando os atributos
    private String marca; //encapsulamento privado
    private String modelo;
    private int ano;
    private static int contadorCarros = 0; //atributo estático para contar quantos carros serão criados

    //construtor
    public carro(String marca, String modelo, int ano){
        
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        contadorCarros++; //implementa o atributo estático

    }

    //método simples
    public void exibirDetalhes() {
        
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);

    }

    //método estático
    public static void exibirTotal() {

        System.out.println("Carros criados: " + contadorCarros);

    }


    
}
