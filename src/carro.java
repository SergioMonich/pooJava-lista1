//exercício 2

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
