// ======================================================================================================================================================================
// EX 10 - Classe Veiculo e Moto: Crie uma classe Veiculo e uma subclasse Moto. Adicione um atributo cilindrada e um método para exibi-lo. 
// ======================================================================================================================================================================

public class Moto extends Veiculo {
    
    //declarando atributos
    private String marca;
    private String modelo;
    
    //construtor
    public Moto(int cilindradas, String marca, String modelo) {

        super(cilindradas);
        this.marca = marca;
        this.modelo = modelo;
           
    }

    //método com subscrição
    @Override
    public void exibirInformacoes() {

        super.exibirInformacoes();
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);

    }

}